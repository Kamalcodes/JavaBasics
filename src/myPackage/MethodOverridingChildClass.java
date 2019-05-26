package myPackage;

public class MethodOverridingChildClass extends MethodOverridingParentClass
{
	void myMethod(int a)
	{
		System.out.println("I am a child class");
	}
	
	public static void main(String args[])
	{
		MethodOverridingChildClass obj=new MethodOverridingChildClass();
		obj.myMethod(0);
		
	}
}
