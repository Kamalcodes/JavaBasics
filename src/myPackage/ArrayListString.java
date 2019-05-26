package myPackage;

import java.util.ArrayList;

public class ArrayListString
{
	public static void main(String args[])
	{
		ArrayList<String> arrList=new ArrayList<String>();
		
		arrList.add(0, "String");
		arrList.add(1,"software testing material");
		
		for(String arrListItem:arrList)
		{
			System.out.println(arrListItem);
		}
		
	}
}