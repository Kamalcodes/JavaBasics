package myPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile
{
//	public static void main(String args[]) throws IOException
//	{
//				//FileReader is meant for reading streams of characters.
//				//for reading streams of raw bytes, consider using a FileInputSystem
//		FileReader fieReader=new FileReader("E:\\dwnloads\\selenium\\Methods.txt");
//				//BufferedReader reads a text from a character inputStream.
//		BufferedReader bufferReader=new BufferedReader(fieReader);
//		
//		String textfromfile=null;
//		                //using while loop to read the file until there are no more lines
//		while((textfromfile=bufferReader.readLine())!=null)
//		{
//			System.out.println(textfromfile);
//		}
//		fieReader.close();
//				//close the BefferedReader object to prevent memory leak
//		bufferReader.close();
//		
//	}
	
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("");
		BufferedReader br=new BufferedReader(fr);
		String text=null;
		while((text=br.readLine())!=null)
		{
			System.out.println(text);
		}
		fr.close();
		br.close();
				
	}
}
