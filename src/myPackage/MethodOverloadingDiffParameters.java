package myPackage;

public class MethodOverloadingDiffParameters
{
	void myMethod(int a)
	{
		System.out.println("this is first");
	}
	void myMethod(int a, int b)
	{
		System.out.println(a +" "+b);
	}
	void myMethod(int a,int b, int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
	
	
	public static void main(String args[])
	{
		MethodOverloadingDiffParameters obj=new MethodOverloadingDiffParameters();
		obj.myMethod(1);
		obj.myMethod(2,3);
		obj.myMethod(4,5,6);
	
	}
}
