package myPackage;

public abstract class AbstractChildOneClass1 extends AbstractSuperClass
{
	public static void main(String args[])
	{
		AbstractSuperClass obj=new AbstractSuperClass() {
			
			@Override
			void myMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		obj.myMethod();
	}
}
