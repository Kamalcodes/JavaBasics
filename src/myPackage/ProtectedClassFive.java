package myPackage;

public class ProtectedClassFive extends ProtectedClassFour
{
	public static void main(String args[])
	{
		ProtectedClassFour obj=new ProtectedClassFour();
		System.out.println(obj.myMethod(0));
	}
}
