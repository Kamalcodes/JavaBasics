package myPackage;

public class VariablesLocalInstanceClass2
{
	static int variable=100;//static variables
	    	int instanceVariable=200;//instance variable
	       
		   public static void main (String args[])
		   {
			   System.out.println("Static varibale" +variable);
			   
			    int localVariable=300; //local variable
			   
			   System.out.println("Local Variable"+localVariable);
			    VariablesLocalInstanceClass2 var=new VariablesLocalInstanceClass2();
			   
			   
			   System.out.println("Instance varibale"+var.instanceVariable);
			   
		   }
	
	 
	
	
}
