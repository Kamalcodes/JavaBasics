package myPackage;

public class VariableLocalInstance2 {
//	static int staticVar=100;	// static variable
//	int instanceVar=200; 	// instance variable	
//	public static void main(String args[])
//	{
//		int localVar=300;	// local variable			
//		System.out.println("Value of a static variable is"+staticVar); 	// We can access static variables without creating an Object of a class	
//				// We cannot access instance variables without creating an Object of a class
//				// Local variables are limited to this method only
//		 System.out.println("Value of a Local Variable is "+localVar);
//		 		// Creating an object of VariablesLocalInstanceClass
//		 VariableLocalInstance2 var = new VariableLocalInstance2();
//		 		//Updating the value of localVar
//		 System.out.println("Value of a Instance Variable is "+var.instanceVar);
//		 localVar = 301;
//		 System.out.println("Updated value of a Local Variable is "+localVar);
//		 		//Updating the value of instanceVar using the object of VariableLocalInstanceClass
//		 var.instanceVar = 201;
//		 System.out.println("Updated value of a Instance Variable is "+var.instanceVar);
//		
//}
	
	static int staticVar=100;
	int instanceVar=200;
	
	public static void main(String args[])
	{
		int localVar=300;
		
		System.out.println(staticVar);
		
		VariableLocalInstance2 var=new VariableLocalInstance2();
		
		System.out.println(var.instanceVar);
		System.out.println(localVar);
		
		var.instanceVar=201;
		
		System.out.println(var.instanceVar);
		
		localVar=301;
		
		System.out.println(localVar);	
	}
}