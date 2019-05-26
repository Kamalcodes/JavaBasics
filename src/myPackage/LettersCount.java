package myPackage;

public class LettersCount
{
	public static void main(String args[]) 
	{
		String str="jagjit singh";
		int count=0;
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			count++;	
		}
		System.out.println("count of letters is "+count);
	
	
	}	
}
