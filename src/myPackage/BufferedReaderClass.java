package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderClass 
{
//	public static void main(String args[]) throws IOException
//	{
//		                       //Instantiate Buffered Reader Object
//		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Input your site name:");
//		                 //To read data using readLine method. Here i will pass any website name.
//		String mySite= BF.readLine();
//	                      	//To print the site name
//		System.out.println("Site name is :"+ mySite);
//	}
	
	
	public static void main(String args[]) 
	{
//			BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("enter any phrase");
//			String fh=BF.readLine();
//			System.out.println("fh");
//	}
	
	String sh=System.console().readLine();
	System.out.println(sh);
}}
