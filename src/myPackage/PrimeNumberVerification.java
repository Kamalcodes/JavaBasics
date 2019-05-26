package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class PrimeNumberVerification 
{
//	public static void main(String args[])
//	{
//	int i,j,flag=0;
//	System.out.println("Enter the number which is you want to verify that is whether prime number or not");
//	Scanner s=new Scanner(System.in);
//	
//	 j=s.nextInt();
//	 for(i=2;i<j;i++)
//	 {
//		 if(j%i==0)
//		 {
//	
//			 flag=0;
//			 break;
//		 }
//		 else
//		 {
//			 flag=1;
//		 }
//	}
//	 if(flag==1)
//	 {
//		 System.out.println(j+"is a prime number");
//	 }
//	 else
//	 {
//		 System.out.println(j+"is not a prime number");
//	 }
	
//	public static void main(String args[])
//	{
//		int limit=100;
//		for(int i=0;i<100;i++)
//		{
//			boolean isPrime=true;
//			for(int j=2;j<i;j++)
//			{
//				if(i%j==0)
//				{
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime)
//				System.out.print(i+" ");
//		}
	
	public static void main(String args[])
	{
		int limit=100;
		for(int i=0;i<100;i++)
		{
			boolean isPrime=true;
			for(int j=0;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
		}
	
	
//	public static void main(String args[])
//	{
//	int n=0,q,r,count=0;
//	BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
//	
//		try
//		{
//			System.out.println("type integer value");
//			n=Integer.parseInt(BF.readLine());
//		}
//		catch (Exception e) 
//		{
//			System.out.println("type integer value only");// TODO: handle exception
//		}
//	q=n;
//	
//	for(int i=1;i<n;i++)
//	{
//		r=q%i;
//		if(r==1)
//		{
//			count=count+1;
//		}
//	}
//	if(count==2)
//	{
//		System.out.println("prime numbers");
//	}
//	else
//	{
//		System.out.println("not a prime number");
//	}
//	}	
	
	
		
			


}
