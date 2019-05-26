package myPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator 
{
	public static void main(String args[])
	{
		ArrayList arrListI=new ArrayList();
		
		arrListI.add(987654);
		arrListI.add("STM");
		arrListI.add(45.23);
		
		Iterator itr=arrListI.iterator();
		
		while(itr.hasNext())
				{
					Object value=itr.next();
						System.out.println("values are" +value);
				}
		
		
		
	}
}
