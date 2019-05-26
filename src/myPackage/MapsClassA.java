package myPackage;

import java.util.HashMap;
import java.util.Map;

public class MapsClassA 
{
	public static void main(String args[])
	{
		Map<String, String> value=new HashMap<>();
		
		value.put("Name", "Raj");
		value.put("country","India");
		value.put("null value", null);
		value.put(null, null);
		
		for(Map.Entry<String, String>en:value.entrySet())
		{
			System.out.println(en.getKey()+"="+en.getValue());
		}
		
	}
}