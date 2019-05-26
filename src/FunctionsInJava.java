
public class FunctionsInJava 
{
	
	//starting point of execution
	public static void main(String agrs[])
	{
			FunctionsInJava obj=new FunctionsInJava();
			//one object will be created. obj is the refence variable, refering to this object
			//after creating the object, the copy of all non static methods will be given to this object
			
			obj.test();
			int l =obj.pqr();
			System.out.println(l);
			
			String s=obj.qa();
			System.out.println(s);
			
			
			double d=obj.division(30, 10);
			System.out.println(d);
	}
	
	
	//not static methods

	public void test()
	{
		System.out.println("test method");
		
	}
	
	public int pqr()
	{
		System.out.println("pqr Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	public String qa()
	{
		System.out.println("qa method");
		String s="Selenium";
		
		return s;
	}
	
	public int division(int x,int y)
	{
		System.out.println("division method");
		int d=x/y;
		
		return d;
	}
	
	
	
	
	
}
 