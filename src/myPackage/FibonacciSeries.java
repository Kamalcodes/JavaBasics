package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String args[])
	{
//		int a=0,b=1,c,i,count=10;
//		System.out.println(a+"+"+b);
//		for(i=2;i<count;i++)
//		{
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
	
	

//	System.out.println("Enter iteration to print fabonacci series");
//	FibonacciCheck.checkFibonacci(new Scanner(System.in).nextInt());	


//class FibonacciCheck
//{
//	public static void checkFibonacci(int number)
//	{
//		int first=0,second=1, third=2;
//		int i=1;
//		System.out.print("print fibonacci upto   "+number+"is");
//		System.out.print(first+","+second+",");
//		while(i<=number)
//		{
//			third=first+second;
//			System.out.print(third+" ");
//			first=second;
//			second=third;
//			++i;
//		}
//	}
	
//	public static void main(String args[])
//	{
//		int f[]=new int[10];
//		f[0]=0; f[1]=1;
//		
//		for(int i=2;i<10;i++)
//		{
//			f[i]=f[i-1]+f[i-2];
//		}
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(f[i]);
//		}
//	}
	
	//NORMAL WAY TO PRINT FIBONACCI SERIES and BY USING ARRAY	
	
		int f[]=new int[10];
		f[0]=0;f[1]=1;
		for(int i=2;i<10;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(f[i]);
		}
	}
}