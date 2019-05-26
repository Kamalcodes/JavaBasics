package myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionClass 

{
	public static void main(String args[]) throws FileNotFoundException
	
	{
		FileInputStream fis=new FileInputStream("E:/Testdocumetn.txt");
	}
}
