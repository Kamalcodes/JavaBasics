
public class B extends A
{
	
	public B()
	{
		super(10);
		//super keyword is used to `call parent  class constructor.
		//super keyword should be written first thing in 
		// the child class.
		//it should be the first statement. 
		//super with parametrized constructor. 
		//one constructor one super keyword.
		System.out.println("child class constructor-");
	}
	
	
	public static void main(String args[])
	{
		B obj=new B();
		
	}
}
