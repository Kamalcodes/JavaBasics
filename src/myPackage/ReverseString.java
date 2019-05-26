package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString 
{
//			public static void main(String args[])
//			{
//				
//					String string="kamal";
//					String reverse=new StringBuffer(string).reverse().toString();
//					System.out.println(string);
//					System.out.println(reverse);				
//			}
	
			
			
//	public static void main(String args[])
//	{
//		StringBuffer a=new StringBuffer("Kamal");
//		System.out.println(a.reverse());	
//	}
	
//	public static void main(String args[])
//	{
//		String input="Software Testing Material";
//		StringBuilder input1=new StringBuilder();
//		input1.append(input);
//		input1=input1.reverse();
//		for (int i=0;i<input1.length();i++)
//		{
//			System.out.print(input1.charAt(i));
//		}	
//	}
	
	
	
//	public static void main(String args[])
//	{
//		String str="";
//		String rev="";
//		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the String");
//		try
//		{
//			str=BF.readLine();
//		}
//		catch (Exception e)
//		{
//			
//			System.out.println("wrong value");// TODO: handle exception
//		}
//		System.out.println("length of the string :"+str.length());
//		for(int i=str.length()-1;i>=0;i--)
//		{
//		System.out.println("Reverse of string: ");
//		rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);	
//		}

	public static void main(String args[])
	{
		String original,reverse="";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a string");
		original=scan.nextLine();
		
		int length=original.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
			System.out.print(reverse);
	}
	
	
	
	
//		public static void main(String args[])
//		{
//		String original,reverse="";
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("enter a String");
//		original=scan.nextLine();
//		
//		int length=original.length();
//			for(int i=length-1;i>=0;i--)
//			reverse=reverse+original.charAt(i);
//		System.out.print(reverse);
//		
//		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
