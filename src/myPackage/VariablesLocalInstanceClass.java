package myPackage;

public class VariablesLocalInstanceClass
{
	final static  int variable=100;
		int instanceVariable=200;
		
		public static void main(String args[])
		{
			int locVariable=300;
			
			System.out.println("static variable" +variable);
			System.out.println("Local variable" +locVariable);

			// we can not call instance variable without creating an object.
			
			VariablesLocalInstanceClass var=new VariablesLocalInstanceClass();
			
			System.out.println("Instance variable" +var.instanceVariable);
			locVariable=301;
			System.out.println("updated value of a local variable is"+locVariable);
			var.instanceVariable=201;
			System.out.println("updated value of instance variable is" +var.instanceVariable);
			
		}
}
