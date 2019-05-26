package myPackage;

import java.util.Scanner;

public class NumberIsEvenOrOdd
{
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=scan.nextInt();
		
		if(num %2==0)
			System.out.println(num + "is a even number");
		else
			System.out.println(num + "is a odd number");
	
	
	}
}
