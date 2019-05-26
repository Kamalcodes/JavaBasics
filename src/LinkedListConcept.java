import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept
{
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("Content of linkedlist:"+ll);
		
		//get Method
		//System.out.println(ll.get(1));
		//
		ll.set(4, "Tom");
		System.out.println(ll.get(4));
		
		ll.remove(1);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		
		ll.addFirst("Kamal");
		System.out.println(ll);
		
		System.out.println("using for loop");
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		System.out.println("********using advanced for loop");
		
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		
		//iterator
		System.out.println("*****using iterator");
		
		Iterator<String>it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//While Loop
		
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
			
		}
		
		
	}
}
