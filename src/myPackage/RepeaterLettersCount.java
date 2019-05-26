package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RepeaterLettersCount
{
//	public static void main(String args[])
//	{
//		String str="howhoho ";
//		int count=0;
//		char[]inp=str.toCharArray();
//		
//		System.out.println("Duplicates characters are:");
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length();j++)
//			{
//				if(inp[i]==inp[j])
//				{
//					System.out.println(inp[j]);
//					count++;
//					break;
//				}
//			}
//		}
//	}
	
	public static void main(String args[]) throws Exception
	{
//		String ch;
//		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the string");
//		ch=bf.readLine();
//		int count=0,len=0;
//		do
//		{
//			try
//			{
//				char name[]=ch.toCharArray();
//				len=name.length;
//				count=0;
//				for(int j=0;j<len;j++)
//				{
//					if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123)))
//					count++;
//				}
//				if(count!=0)
//					System.out.println(name[0]+" "+count+"Times");
//				ch=ch.replace(""+name[0],"");
//			}
//			catch (Exception e)
//			{
//				// TODO: handle exception
//			}
//		}
//		while(len!=1);

	
//		String str="hello";
//		Map<Character,Integer>charMap=new HashMap<Character,Integer>();
//		char[] arr=str.toCharArray();
//		
//		for(char value:arr)
//		{
//			if(Character.isAlphabetic(value))
//			{
//				if(charMap.containsKey(value))
//				{
//					charMap.put(value,charMap.get(value)+1);
//				}
//				else
//				{
//					charMap.put(value,1);
//				}
//			}
//		}	
//				System.out.println(charMap);
				
		// repeat letter count
		
		String str="hello good Morning how are you";
		Map<Character, Integer>charMap=new HashMap<Character,Integer>();
		char[]arr=str.toCharArray();
		
		for(char value:arr)
		{
			if(Character.isAlphabetic(value))
			{
				if(charMap.containsKey(value))
				{
					charMap.put(value, charMap.get(value)+1);
				}
				else
				{
					charMap.put(value, 1);
				}
			}
		}
		System.out.print(charMap);
	}	
} 

