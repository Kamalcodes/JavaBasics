package myPackage;

import java.util.Scanner;

public class CompareStrings
{
	public static void main(String args[])
	{
//		String s1,s2;
//		Scanner in=new Scanner(System.in);
//		
//		System.out.println("Enter the first string");
//		s1=in.nextLine();
//		
//		System.out.println("Enter the second string");
//		s2=in.nextLine();
//		
//		if(s1.compareTo(s2)>0)
//			System.out.println("First string is greater than second");
//		else if(s1.compareTo(s2)<0)
//			System.out.println("First string smaller than the second");
//		else
//			System.out.println("Both strings are equal");
	
		String s1,s2;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter first string");
		s1=scan.nextLine();
		
		System.out.println("enter second string");
		s2=scan.nextLine();
		
		if(s1.compareTo(s2)>0)
			System.out.println("first string is greater");
		else if(s1.compareTo(s2)<0)
			System.out.println("second string is greater");
	
	}
}
