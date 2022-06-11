package Tools;

import java.io.File;
import java.io.IOException;

public class GenerateJflex
{

	public GenerateJflex()
	{
	}

	public void generateJFlexScanner()
	{
		Runtime r = Runtime.getRuntime();
		Process p;
		try
		{
			p = r.exec(new String[] {
				"java",
				"-jar",
				"..\\jflex-full-1.8.2.jar",
				"..\\scanner.flex"
			}, null, new File("src\\"));
			System.out.println(p.waitFor() == 0 ? "Sucesso ao gerar o analisador léxico" : "Erro ao gerar o analizadorléxico");
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
