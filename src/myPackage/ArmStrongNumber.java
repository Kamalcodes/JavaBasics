package myPackage;

import java.util.Scanner;

public class ArmStrongNumber
{
//	public static void main(String args[])
//	{
//		int n,v,r,sum=0;
//		System.out.println("Enter three digits");
//		Scanner scan=new Scanner(System.in);
//		n=scan.nextInt();
//		scan.close();
//		
//		v=n;
//		while (v>0)
//		{
//			r=v%10;
//			sum=sum+r*r*r;
//			v=v/10;
//		}
//		if(n==sum)
//		{
//			System.out.println("Armstrong number");
//		}
//		else
//		{
//			System.out.println("Not an Armstrong number");
//		}
//	}
	
	public static void main(String args[])
	{
//		int n,v,r,sum=0;
//		
//		System.out.println("enter digits");
//		Scanner scan=new Scanner(System.in);
//		n=scan.nextInt();
//		scan.close();
//		
//		v=n;
//		while(v>0)
//		{
//			r=v%10;
//			sum=sum+r*r*r;
//			v=v/10;
//		}
//		if(n==sum)
//		{
//			System.out.println("armstrong number");
//		}
//		else
//		{
//			System.out.println("not armstrong number");
//		}
	
			int n,v,r,sum=0;
			Scanner scan=new Scanner(System.in);
			
			System.out.println("enter digits");
			n=scan.nextInt();
			
			v=n;
			while(v>0)
			{
				r=v%10;
				sum=sum+r*r*r;
				v=v/10;
			}
			
			if(n==sum)
			{
				System.out.println("armstrong");
			}
			else
			{
				System.out.println("not an armstrong number");
			}
					
	}	
}
