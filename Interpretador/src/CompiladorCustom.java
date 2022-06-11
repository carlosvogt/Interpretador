import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Tools.GenerateJCup;
import Tools.GenerateJflex;
import Tools.Helper;
import java_cup.runtime.Symbol;

public class CompiladorCustom
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		try
		{
			java.util.Scanner userOption = null;
			GenerateJCup jCupAccess = new GenerateJCup();
			GenerateJflex jFlexAccess = new GenerateJflex();
			int menuOption  = -1;
						
				if (userOption == null) {
					System.out.println("1-> Gerar arquivo JFlex\n"
							+ "2 - Gerar arquivo JCup\n"
							+ "3 - Exibir lista de tokens\n"
							+ "4 - Exibir reconhecimento\n"
							+ "5 - Encerrar o programa\n"
							+ "Insira uma opção e aperte ENTER:");
					Helper.preProcessingFile();
					userOption = new java.util.Scanner(System.in);
					menuOption  = userOption.nextInt();
				}
				
				switch (menuOption)
				{
					case 1:
						jFlexAccess.generateJFlexScanner();
						System.out.println("\n");
						main(args);
						break;
					case 2:
						jCupAccess.generateJCupParser();
						System.out.println("\n");
						main(args);
						break;
					case 3:
						printTokens();
						System.out.println("\n");
						main(args);
						break;
					case 4:
						recognizeSentences();
						System.out.println("\n");
						main(args);
						break;
					case 5:
						System.out.println("Programa encerrado!");
						System.out.println("\n");
						Runtime.getRuntime().exit(0);
						break;
					default:
						break;
				}
				Runtime.getRuntime().gc();
				userOption.nextLine();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// Reconhecer sentenças
	public static void recognizeSentences()
	{
		try
		{
			Scanner scanner2 = new Scanner(new FileReader("input.txt"));
			Parser parser = new Parser(scanner2);
			parser.parse();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println("Atenção! Não foi possivel fazer a compilação pois foram encontrados problemas na sintaxe.");
		}
	}
	
	// Exibir lista de tokens
	public static void printTokens()
	{
		try
		{
			Scanner scanner = new Scanner(new FileReader("input.txt"));
			System.out.println("Análise léxica - Lista de Tokens:");
			Symbol s = scanner.next_token();
			while (s.sym != Tokens.EOF)
			{
				System.out.printf("<%d, \t%s\t>\n", s.sym, s.value);
				s = scanner.next_token();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}