package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial
{
	
//	public static void main (String args[])
//	{
//		
	
	//for(int counter=0;counter<=10;counter++)
//		{
//			System.out.printf("%d!=%d\n",counter,factorial(counter));
//		}
//	}
//	
//	public static long factorial(long number)
//	{
//		if(number<1) return 1;
//		else return number*factorial(number-1);
//	}
//	
	
	//Example-2
	
//	public static void main(String args[])
//	
//	{
//		int number=9;
//		int factorial=number;
//		for(int i=(number-1);i>1;i--)
//		{
//			factorial=factorial*i;
//		}
//		System.out.println("factorial of 9 is "+ factorial);
//	}
	
//		public static void main(String args[])
//		{
//			
	
	//Example-3
	
//	public static void main(String args[])
//	{
//		long fact=1;
//		BufferedReader val=new BufferedReader(new InputStreamReader(System.in));
//		try
//		{
//			System.out.println("Enter the values");
//			long n=Integer.parseInt(val.readLine());
//			for(long i=n;i>=1;i--)
//			{
//				fact=fact*i;
//		}
//			System.out.println(fact);
//	}
//		catch (Exception e)
//		{
//			System.out.println("Entered wrong input");
//		}
//	}
	
	
//	public static void main(String args[])
//	{
//		int fact=1;
//		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));			
//		try
//		{
//			System.out.println("enter digtis");
//			int n=Integer.parseInt(BF.readLine());
//			
//			for(int i=n;i>=1;i--)
//			{
//				fact=fact*i;
//			}
//			System.out.println(fact);
//					
//		}
//		catch (Exception e)
//		{
//			System.out.println("enter digits only");// TODO: handle exception
//		}
//	}
	
		public static void main(String args[])
		{
			int fact=1;
			BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
			
			try
			{
				System.out.println("enter digits");
				int n=Integer.parseInt(BF.readLine());
				
				for(int i=n;i>=1;i--)
				{
					fact=fact*i;
				}
				System.out.println(fact);
			}
			catch (Exception e)
			{
				System.out.println("Enter digits only");// TODO: handle exception
			}
		}

}


