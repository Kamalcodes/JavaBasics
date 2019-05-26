package myPackage;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first number");
		int num=scan.nextInt();
		
		System.out.println("Enter a second number");
		int num1=scan.nextInt();
		
		
		int temp=0;
		temp=num;
		num=num1;
		num1=temp;
		
		System.out.println("After swapping a numbers");
		System.out.println("number first is "+ num);
		System.out.println("number second is "+ num1);

	}

}
