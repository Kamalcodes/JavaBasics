package myPackage;

import java.util.Scanner;

public class BubbleSort 
{
//	public static void main(String args[])
//	{
//		int temp;
//		int k[]= {26,27,31,35,7,2,1};
//		for (int i=0;i<k.length;i++)
//		{
//			for(int j=0;j<(k.length-1);j++)
//			{
//				if(k[j]<k[j+1])
//				{
//					temp=k[j];
//					k[j]=k[j+1];
//					k[j+1]=temp;					
//				}
//				System.out.println(k[j]);
//			}
//			
//		}
//		            
//	}
	
//	public static void main(String args[])
//	{
//		int k[]= {99,5,56,42,2,0};
//		int temp=0;
//		for(int i=0;i<=k.length-1;i++)
//		{
//			for(int j=0;j<=(k.length);j++)
//			{
//				if(k[j]<=k[j+1])
//				{
//					temp=k[j];
//					k[j]=k[j+1];
//					k[j+1]=temp;
//				}
//				System.out.println(k[j]);
//			}
//		}
//	}
	
	
	public static void main(String args[])
	{
		int k[]= {7,56,82,3,1,65};
		int temp;
		for(int i=0;i<=k.length;i++)
		{
			for(int j=0;j<(k.length-1);j++)
			{
				if(k[j]<=k[j+1])
				{
					temp=k[j];
					k[j]=k[j+1];
					k[j+1]=temp;
				}
				System.out.println(k[j]);
			}


		
	}
		
	}
	
	
//	public static void main(String args[])
//	{
//		int temp;
//		int k[]= {9,4,8,2,3,1};
//		for(int i=0;i<k.length;i++)
//		{
//			for(int j=0;j<(k.length-1);j++)
//			{
//				if(k[j]<k[j+1])
//				{
//					temp=k[j];
//					k[j]=k[j+1];
//					k[j+1]=temp;
//				}
//				System.out.println(k[j]);
//			}
//		}
//	}
	
//	public static void main(String args[])
//	{
//		int n,c,d,swap;
//
//		Scanner scan=new Scanner(System.in);
//		System.out.println("input numbers");
//		n=scan.nextInt();
//		//scan.close();
//		int array[]=new int[n];
//		
//		System.out.println("Enter integers");
//		
//		for(c=0;c<n;c++)
//		array[c]=scan.nextInt();
//		
//		for(c=0;c<(n-1);c++)
//		{
//			for(d=0;d<n-c-1;d++)
//			{
//				if(array[d]>array[d+1])
//				{
//					swap=array[d];
//					array[d]=array[d+1];
//					array[d+1]=swap;
//				}
//			}
//		}
//		System.out.println("sorted list of numbers");
//		for(c=0;c<n;c++)
//			System.out.println(array[c]);
//	}
}
