package myPackage;

import java.util.ArrayList;

public class ConvertArrayToArrayList3 
{
	public static void main(String args[])
	{
		ArrayList<String> arrList=new ArrayList<String>();
		
		String  students[]= {"Raj","kumar","RajKumar"};
		for(int i =0;i<students.length;i++)
		{
			arrList.add(students[i]);
		}
		System.out.println(arrList);
		
		
		for(String str:arrList)
		{
			System.out.println(str);
		}
		
		
	}
}
