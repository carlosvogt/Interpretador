package Tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;

public class Helper
{
	static String[] alphabetForVariables = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","z","y","w"};
	public Helper()
	{

	}

	public static String removeDiacritics(String s)
	{ 
		s = Normalizer.normalize(s, Normalizer.Form.NFD);
		s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return s;
	}

	public static String adjustPunctuation(String s)
	{
		s = s.replaceAll("(?<![\\w\\d])[?](?![\\w\\d])", ";");
		s = s.replaceAll("(?<![\\w\\d])[.](?![\\w\\d])", ";");
		s = s.replaceAll("â€˜", "#");
		s = s.replaceAll("â€™", "#");
		s = s.replaceAll("(?<![\\w\\d])['](?![\\w\\d])", "#");
		
		for (int i = 0; i < alphabetForVariables.length; i++)
		{
			s = s.replaceAll("( " + alphabetForVariables[i] + " )", " &" + alphabetForVariables[i] + " ");
			s = s.replaceAll("( " + alphabetForVariables[i] + ";)", " &" + alphabetForVariables[i] + ";");
		}
		s = s.replaceAll("#Sim#|#sim#", "%Sim%");
		s = s.replaceAll("#Não#|#não#", "%Não%");
		return s;
	}

	public static ArrayList<String> manipulingDataFromArray(ArrayList<String> sentences)
	{
		ArrayList<String> sentencesWithoutPreP = new ArrayList<String>();
		String sTemp;
		for (String string : sentences)
		{
			sTemp = adjustPunctuation(string);
			sTemp = removeDiacritics(sTemp);
			sentencesWithoutPreP.add(sTemp);
		}
		return sentencesWithoutPreP;
	}

	public static void preProcessingFile()
	{
		ArrayList<String> sentencesToWrite = new ArrayList<String>();
		readDocument(sentencesToWrite);
		sentencesToWrite = manipulingDataFromArray(sentencesToWrite);
		writeDocument(sentencesToWrite);
	}

	public static void readDocument(ArrayList<String> sentences)
	{
		try
		{
			if (sentences.isEmpty())
			{
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));
				String s;
				while ((s = br.readLine()) != null)
				{
					sentences.add(s);
				}
				br.close();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void writeDocument(ArrayList<String> sentences)
	{
		try
		{
			if (!sentences.isEmpty())
			{
				BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
				for (String string : sentences)
				{
					if (!string.equalsIgnoreCase(sentences.get(sentences.size() - 1)))
						bw.write(string + "\n");
					else
						bw.write(string);
				}
				bw.close();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
