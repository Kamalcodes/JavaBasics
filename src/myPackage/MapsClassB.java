package myPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsClassB 
{
	public static void main(String argds[])
	{
		Map<String, String> value=new HashMap<>();
		
		value.put("Name", "Raj");
		value.put("Country", "India");
		value.put("Null values", "null");
		value.put(null, null);
		
		System.out.println(value);
		System.out.println(value.get("Name"));
		System.out.println(value.get("Name1"));
		System.out.print(value.size());
				
		//converting it into set so that we can transverse
		
		Set<String>keys=value.keySet();
		
		for(String key:keys)
		{
			System.out.println(value.get(key));
			
		}
		System.out.println(value.get("Country"));
		value.remove("Country");
		
		System.out.println(value.get("Country"));
		
		
	}
}
