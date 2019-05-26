package myPackage;

import java.util.ArrayList;
public class ArrayListClass
{
	public static void main(String args[])
	{
		ArrayList arryList=new ArrayList();
		
		arryList.add(987654321);
		arryList.add("STM");
		arryList.add("STM");
		arryList.add(54.23);
		
		System.out.println(arryList);
		System.out.println(arryList.get(1));
		
	}
}
