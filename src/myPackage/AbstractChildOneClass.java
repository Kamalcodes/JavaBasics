package myPackage;

//public class AbstractChildOneClass extends AbstractSuperClass
//{
//	public static void main(String args[])
//	{
//		AbstractSuperClass df=new AbstractChildOneClass();
//		
//		System.out.println("datamember of a  class a " +df.a);
//		df.myMethod();
//		df.myMethod(0);
//		
//	}
//@Override
//	void myMethod()
//	{
//		System.out.println("i am in a child class");
//	}
//	
//	
//}
	
public class AbstractChildOneClass extends AbstractSuperClass
{
	public static void main (String args[])
	{
		AbstractSuperClass df=new AbstractChildOneClass();
		
		System.out.println(df.a);
		df.myMethod();
		df.myMethod(0);
	}
	@Override
	void myMethod()
	{
		System.out.println("i am in a child class");
	}
}
