package myPackage;

public class PrivateClassTwo 
{
	public static void main(String args[])
	{
		PrivateClassOne obj=new PrivateClassOne();
		//System.out.println(obj.x);
		//System.out.println(obj.myMethod(0));
		
		System.out.println(obj.y);
		System.out.println(obj.myMethodone(0));
	}
}