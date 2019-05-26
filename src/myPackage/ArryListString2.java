package myPackage;

import java.util.ArrayList;

public class ArryListString2
{
	public static void main(String args[])
	{
		ArrayList<String> arrList=new ArrayList<String>();
		
		arrList.add(0,"STMM");
		arrList.add(1,"STM");
		System.out.println(arrList);
		
		arrList.remove("STM");
		System.out.println(arrList);
		
		arrList.add(1,"STM");
		System.out.println(arrList);
		
		arrList.remove(1);
		System.out.println(arrList);
		
		
	}
}
