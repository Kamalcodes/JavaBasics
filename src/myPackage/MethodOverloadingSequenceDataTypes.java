package myPackage;

public class MethodOverloadingSequenceDataTypes 
{
	void myMethod(int a, String b)
	{
		System.out.println(a+ " "+b);	
	}
	
	void myMethod(String a, int b)
	{
		System.out.println(b+" "+a);
	}
	public static void main(String args[])
	{
		MethodOverloadingSequenceDataTypes obj=new MethodOverloadingSequenceDataTypes();
		obj.myMethod(0, "hello");
		obj.myMethod("hi", 2);
	}
}
