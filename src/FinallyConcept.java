
public class FinallyConcept
{
	public static void main(String args[])
	{
		test2();
	}
	
	
	//the finally keyword is used to association with try catch block.
	//whatever we have written into the finally method will be 
	//get executed. does not matter about try catch block declaration.
	//only finally method content will be the final output.
	//we can create the finally block in the place of catch block.
	public static void test1()
	{
		try
		{
			System.out.println("inside test1 method");
			throw new RuntimeException("test"); 
		} 
		catch (Exception e) 
		{
			System.out.println("inside catch block");
		}
		
		finally 
		{
			System.out.println("inside the finally block");
		}
		
	}
	
	public static void test2()
	{
		try
		{
			System.out.println("inside the try block");
		}
		finally
		{
			System.out.println("inside the finally block");
		}
	}
	
	
	public void division()
	{
		int i=10;
		try
		{
			System.out.println("inside try block");
			int k=i/0;
		} 
		catch(NullPointerException e)
		{
			System.out.println("inside the catch block");
			System.out.println("divide by Zero error");
		}
		
		finally
		{
			System.out.println("execute this code even after the ecception");
		}
	}
	
	
	
}
