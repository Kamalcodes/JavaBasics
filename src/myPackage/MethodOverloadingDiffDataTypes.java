package myPackage;

public class MethodOverloadingDiffDataTypes 
{
	void myMethod(int a) {
		System.out.println(a);
		
	}
	void myMethod(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		MethodOverloadingDiffDataTypes obj=new MethodOverloadingDiffDataTypes();
		obj.myMethod(10);
		obj.myMethod("i am a string");
	}
}
