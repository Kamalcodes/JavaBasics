package myPackage;

import java.io.FileInputStream;

public class CheckedExceptionClassA
{
	public static void main(String args[])
	{
		try
		{
		FileInputStream fis =new FileInputStream("E:/textdocument.txt");
		}
		catch(Exception e)
		{
			System.out.println("File No found");
		}
		
		
	}
}
