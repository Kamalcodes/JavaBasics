package myPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteToFile 
{
//	public static void main(String args[]) throws IOException
//	{
//		String textToWrite=("*****learning java basics");
//				//import BefferedWriter and FileWrite classes
//				/* BufferedWriter writes text to a character-output stream, buffering characters 
//				so as to provide for the efficient writing of single characters, arrays, and strings. */
//		BufferedWriter writer=new BufferedWriter(new FileWriter("E:\\dwnloads\\selenium\\Basic java\\Practice.txt"));
//		writer.write(textToWrite);
//				//close the BufferedWriter object to prevent the memory leak
//		writer.close();
//	}
	
	public static void main(String args[]) throws Exception
	{
		String texttowrite=("");
		BufferedWriter bw=new BufferedWriter(new FileWriter(""));
		bw.write(texttowrite);
		bw.close();
		
	}
}
