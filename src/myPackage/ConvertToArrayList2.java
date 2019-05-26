package myPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertToArrayList2
{
	public static void main(String args[])
	{
		String [] students= {"Raj","kumar","Raj Kumar"};
		
		ArrayList<String> arrList=new ArrayList<String>();
		
		Collections.addAll(arrList, students);
		
		arrList.add("Hello");
		System.out.println(arrList);
	}
}
