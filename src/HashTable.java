
import java.util.Hashtable;

public class HashTable 
{
	public static void main(String args[])
	{
		Hashtable h=new Hashtable();
		
		h.put("A","Hello");
		h.put("B", "Test");
		h.put("C", "world");
		
		System.out.println(h.size());
		
		h.put(12.33, 100);
		h.put(true, 'c');
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		
		Hashtable<Integer, Boolean>  h2=new Hashtable<Integer,Boolean>();
	
			
		
		
		
		
		
	}
}
