package myPackage;

import java.util.ArrayList;

public class ArrayListClass1
{
	public static void main(String args[])
	{
		 ArrayList arrList = new ArrayList();
		 // Adding elements to the array list
		 arrList.add(987651);
		 
		 int listSize = arrList.size();
		 
	
		 
		 for(int i=0; i<listSize; i++){
		 System.out.println("Value of Array List at the index "+i+" is "+arrList.get(i));
		 }
		 
		
	}


	
	
}
