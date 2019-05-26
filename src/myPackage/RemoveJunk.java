package myPackage;

public class RemoveJunk {

	public static void main(String[] args)
	{
		String s="$%%#$%^% print 21114545";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);

	}


	
	
}