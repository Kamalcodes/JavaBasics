package myPackage;

public class VariableLocalInstance 
{
//	static int staticVar=100;	// static variable
//	int instanceVar=200; 	// instance variable	
//	public static void main(String args[])
//	{
//		int localVar=300;	// local variable			
//		System.out.println("Value of a static variable is"+staticVar); 	// We can access static variables without creating an Object of a class	
//		VariableLocalInstance var=new VariableLocalInstance();      // Creating an instance of a class 'VariablesLocalInstance
//		System.out.println("Value of a Instance Variable is" +var.instanceVar);
//		System.out.println("Value of a local variable is"+ localVar);
//	}
	
	
	
	
	static int staticVar=100;
	int instanceVar=200;
	
	public static void main(String args[])
	{
		int localVar=300;
		
		System.out.println(staticVar);
		
		System.out.println(localVar);
		
		VariableLocalInstance var=new VariableLocalInstance();
		System.out.println(var.instanceVar);
	
	}
	
}
