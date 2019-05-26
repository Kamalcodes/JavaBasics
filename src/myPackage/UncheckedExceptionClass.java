package myPackage;

public class UncheckedExceptionClass
{
	public static void main (String args[])
	{
		int a=100;
		int b=0;

		try {
		System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//Exception can be defined in two categories/
		//Checked Exception
		//unchecked Exception
		//Checked Exception---IO exception
						//Class not Found Exception
						//SQL Exception
		
		//Unchecked Exception
				//Arithmatic Exception
				//NUllPointer Exception
				//ArrayofIndexoutOfBound Exception
				//Illegal argument Exception
		
		
	}
}
