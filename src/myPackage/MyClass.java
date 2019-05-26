package myPackage;

public class MyClass implements MyInterface
{
//	public static void main(String args[])
//	{
//		MyInterface ifh=new MyClass();
//		
//		ifh.myMethodOne();
//	}
//	@Override
//	public void myMethodOne()
//	{
//		System.out.println("Implementation of myMethodone");
//	}
//	
	
	public static void main (String args[])
	{
		MyInterface my=new MyClass();
		my.myMethodOne();	
	}

@Override
public void myMethodOne() {
	System.out.println("implementation of myMethodOne");
	
}
}


