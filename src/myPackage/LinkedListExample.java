package myPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String args[])
	{
		LinkedList<String> lref=new LinkedList<String>();
		lref.add("RC");
		lref.add("IDE");
		lref.add("Grid");
		lref.add("WebDriver");
		System.out.println(lref);
		
		lref.addFirst("QTP");
		lref.addLast("Protractor");
		System.out.println(lref);
		
		lref.add(0, "Mercury");
		System.out.println(lref);
		
		lref.removeFirst();
		lref.removeLast();
		System.out.println(lref);
		
		lref.remove("Two");
		System.out.println(lref);
		
		lref.remove(3);
		System.out.println(lref);
		
		System.out.println(lref.get(0));
		lref.set(3, "NewEntry");
		System.out.println(lref);
		
		// we have four ways to print all the values in LinkedList. which are:
		// Loop, each,Iterator and while
		
		 System.out.println("====== For Loop starts here ======");
		 	for(int l=0; l<lref.size(); l++) 
		 	{
			 System.out.println(lref.get(l));
		 	}
		 System.out.println("====== For Loop ends here ======");
		 
		 
		 
		 System.out.println("====== For Each starts here ======");
		 	for(String str:lref) 
		 	{
			 System.out.println(str);
		 	}
		 System.out.println("====== For Each ends here ======");
		 
		 
		 
		 System.out.println("====== Iterator starts here ======");
		 	Iterator<String> it = lref.iterator();
		 	while(it.hasNext())
		 	{
		 		System.out.println(it.next());
		 	} 
		 System.out.println("====== Iterator ends here ======");
		 
		 
		 
		 
		 System.out.println("====== While starts here ======");	 
		 	int num=0;
		 	while(lref.size()>num)
		 		{
		 		System.out.println(lref.get(num));
		 		num=num+1;
		 		} 
		 System.out.println("====== While ends here ======");
		 
		 }
		
		
		
		
	}

