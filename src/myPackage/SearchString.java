package myPackage;

public class SearchString
{
	public static void main(String args[])
	{
		String str="Hello Readers";
		int index=str.indexOf("Hello");
		
		if(index==-1)
		{
			System.out.println("Hello not found");	
		}
		else
		{
			System.out.println("Hello at Index  "+index);
		}
		
//		String str="The car is in parking";
//		System.out.println(str.contains("car"));
	}
}
