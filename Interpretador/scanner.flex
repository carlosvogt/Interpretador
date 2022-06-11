import java_cup.runtime.Symbol;

/*
Directivas:
public: classe publica
cup: compatibilidade com cup
full: estende o alfabeto com todos os valores de 8 bits
linha: adicionar a variavel int yyline, para indicar a linha do lexema
char: adicionar a variavvel int yychar, para indicar o indice do primeiro caractere do lexema
ignorecase: validar, independentemente de a letra ser maiuscula ou minuscula
eofval: especifica um valor de retorno no final do arquivo
*/

%%
%public
%class Scanner
%cup
%full
%line
%char

%{
    StringBuffer string = new StringBuffer();
	
	public void report_error(String message, Object info)  {
        System.out.println("Warning - " + message);
    }

    public void report_fatal_error(String message, Object info)  {
        System.out.println("Error - " + message);
        System.exit(-1);
    }
%}

%eofval{
	return new Symbol(Tokens.EOF,new String("Fim do arquivo"));
%eofval}

//Normal treatment
digito = [0-9]
letra = [a-zA-Z]
id = [&]({letra}|{digito}|"_")*
palavra = ([a-zA-Z]|\é)*
espaco = \t|\f|" "|\r|\n
wordBetweenCompost = (\#(.*?)\#)
wordBetweenSimple =(%(\w*)%)

//Specific treatment for natural language
dobro =dobro
triplo =triplo
mais =mais
menos =menos
multiplicar =multiplicar|vezes
dividir =dividir
maiorQue =maior que
menorQue =menor que
maiorOuIgual =maior ou igual
menorOuIgual =menor ou igual
maior =maior
menor =menor
atribuicao =atribuir|guarde|Guarde|guardar|Guardar
se =se|Se
senao =senao|Senao
igual =igual
escreva =escreva|Escreva
repita =repita
um =um
dois =dois
tres =tres
quatro =quatro
cinco =cinco
seis =seis
sete =sete
oito =oito
nove =nove
dez =dez
primeiro =primeiro
segundo =segundo
terceiro =terceiro
quarto =quarto
quinto =quinto


%state STRING

%%

<YYINITIAL> {	
";"				{return new Symbol(Tokens.SEMI, 		 yytext());}
"="				{return new Symbol(Tokens.ATRIB, 		 yytext());}
"-"				{return new Symbol(Tokens.MENOS, 		 yytext());}
"+"		    	{return new Symbol(Tokens.MAIS, 		 yytext());}
"*"				{return new Symbol(Tokens.VEZES, 		 yytext());}
"/"  			{return new Symbol(Tokens.DIVIDIR, 		 yytext());}
"<="  			{return new Symbol(Tokens.MENORIGUAL, 	 yytext());}
">="  			{return new Symbol(Tokens.MAIORIGUAL, 	 yytext());}
"<"  			{return new Symbol(Tokens.MENOR, 		 yytext());}
">"  			{return new Symbol(Tokens.MAIOR, 		 yytext());}
"("				{return new Symbol(Tokens.LPAREN, 		 yytext());}
")"				{return new Symbol(Tokens.RPAREN, 		 yytext());}
"["				{return new Symbol(Tokens.LCOL, 		 yytext());}
"]"				{return new Symbol(Tokens.RCOL, 		 yytext());}
","				{return new Symbol(Tokens.VIRG, 		 yytext());}
{id}			{return new Symbol(Tokens.ID, 			 yytext());}
{digito}+		{return new Symbol(Tokens.NUMERO, 		 new Integer(yytext()));}
{dobro}			{return new Symbol(Tokens.DOBRO, 		 yytext());}
{triplo}		{return new Symbol(Tokens.TRIPLO, 		 yytext());}
{mais}		    {return new Symbol(Tokens.MAIS, 		 yytext());}
{menos}		    {return new Symbol(Tokens.MENOS, 		 yytext());}
{multiplicar}   {return new Symbol(Tokens.VEZES, 		 yytext());}
{dividir}  		{return new Symbol(Tokens.DIVIDIR, 		 yytext());}
{maiorQue}		{return new Symbol(Tokens.MAIORQUE, 	 yytext());}
{menorQue}		{return new Symbol(Tokens.MENORQUE, 	 yytext());}
{maiorOuIgual}	{return new Symbol(Tokens.MAIORIGUAL, 	 yytext());}
{menorOuIgual}	{return new Symbol(Tokens.MENORIGUAL, 	 yytext());}
{maior}			{return new Symbol(Tokens.MAIOR, 		 yytext());}
{menor}			{return new Symbol(Tokens.MENOR, 		 yytext());}
{atribuicao}	{return new Symbol(Tokens.ATRIB, 		 yytext());}
{igual}			{return new Symbol(Tokens.IGUAL, 		 yytext());}
{se}			{return new Symbol(Tokens.IF, 			 yytext());}
{senao}			{return new Symbol(Tokens.ELSE, 		 yytext());}
{escreva}		{return new Symbol(Tokens.WRITE, 		 yytext());}
{repita}		{return new Symbol(Tokens.WHILE, 		 yytext());}
{um}		    {return new Symbol(Tokens.UM, 			 yytext());}
{dois}		    {return new Symbol(Tokens.DOIS, 		 yytext());}
{tres}          {return new Symbol(Tokens.TRES, 		 yytext());}
{quatro}	    {return new Symbol(Tokens.QUATRO, 		 yytext());}
{cinco}	 	  	{return new Symbol(Tokens.CINCO, 		 yytext());}
{seis}		    {return new Symbol(Tokens.SEIS, 		 yytext());}
{sete}		    {return new Symbol(Tokens.SETE, 		 yytext());}
{oito}		    {return new Symbol(Tokens.OITO, 		 yytext());}
{nove}		    {return new Symbol(Tokens.NOVE, 		 yytext());}
{dez}		    {return new Symbol(Tokens.DEZ, 			 yytext());}
{primeiro}	    {return new Symbol(Tokens.PRIMEIRO, 	 yytext());}
{segundo}	    {return new Symbol(Tokens.SEGUNDO, 		 yytext());}
{terceiro}	    {return new Symbol(Tokens.TERCEIRO, 	 yytext());}
{quarto}	    {return new Symbol(Tokens.QUARTO, 		 yytext());}
{quinto}	    {return new Symbol(Tokens.QUINTO, 		 yytext());}
{espaco}		{}
{palavra}       {}
{wordBetweenCompost}+ {return new Symbol(Tokens.PALAVRA,  yytext());}
{wordBetweenSimple}+ {return new Symbol(Tokens.PALAVRA,  yytext());}
.           	{ System.out.println("Caracter ilegal: " + yytext()); }
}

<STRING> {
  \"                             { yybegin(YYINITIAL); 
      return new Symbol(Tokens.PALAVRA,string.toString());}
  [^\n\r\"\\]+                   { string.append(yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}