package myPackage;

public class LargestValue 
{
	public static void main(String args[])
	{
	int[]arr= {28,45,2,1,5,61,25,32};
	
	int val=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if (arr[i]>val)
		{
			val=arr[i];
		}
	}
	System.out.println("Largest value in the given array is "+val);
}}
