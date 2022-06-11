package Tools;

import java.io.File;
import java.io.IOException;

public class GenerateJCup
{

	public GenerateJCup()
	{
	}

	public void generateJCupParser()
	{

		try
		{ 
			Runtime r = Runtime.getRuntime();
			Process p; 
			p = r.exec(new String[] {
				"java",
				"-jar",
				"..\\java-cup-11b.jar",
				"-parser",
				"Parser",
				"-symbols",
				"Tokens",
				"..\\parser.cup"
			}, null, new File("src\\"));
			System.out.println(p.waitFor() == 0 ? "Sucesso ao gerar o analisador sintático" : "Erro ao gerar o analizador sintático");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
