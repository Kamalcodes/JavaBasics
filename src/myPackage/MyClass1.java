package myPackage;

public class MyClass1 implements MyInterfaceTwo

{
//	public static void main(String args[])
//	{
//	
//	MyInterfaceTwo obj=new MyClass1();
//	obj.myMethodOne();
//	
//	}
//	
//	@Override
//	public void myMethodTwo()
//	{
//		System.out.println("implements method two");
//	}
//	@Override
//	public void myMethodOne()
//	{
//		System.out.println("implements method one");
//	}
	
	
	public static void main(String args[])
	{
		MyInterfaceTwo my=new MyClass1();
		my.myMethodOne();
		my.myMethodTwo();
	}

@Override
public void myMethodOne() 
{
	System.out.println("my method one");
	
}

@Override
public void myMethodTwo() 
{
System.out.println("my method two");	
}
	
}
