package myPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverArrayToArrayList 
{
	public static void main(String args[])
	{
		String[] students= {"Raj","kumar","Rajkumar"};
		ArrayList<String> arrList=new ArrayList<>(Arrays.asList(students));
		
		arrList.add("Ramesh");
		arrList.add("Bala");
		
		System.out.println(arrList);
		System.out.println(arrList.get(2));
	}
}
