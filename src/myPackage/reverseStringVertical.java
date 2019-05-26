package myPackage;

public class reverseStringVertical 
{
	public static void main (String args[])
	{
		
//		char[]verti=str.toCharArray();
//		for(int i=verti.length-1;i>=0;i--)
//		{
//			System.out.print(verti[i]);	
//			
//		}
//	
//			System.out.println(removeCharAt(str, 3));                     //remove a single character from a string
//		}
//		public static String removeCharAt(String s, int pos)              //method of remove a single character from a string
//		{
//			return s.substring(0, pos) + s.substring(pos + 1);
//		
		//way 2 of how to reverse a string
	
	String str="kamal";	
	int len=str.length();
	String rev="";
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);
	
	}	
		
	
	
		
	}

















































