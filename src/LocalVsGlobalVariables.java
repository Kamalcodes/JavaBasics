
public class LocalVsGlobalVariables 
{
		//Global variables	
	String name="Tom";
	int age=26;
	
	public static void main(String[] args)
	{
		int i=25;//local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();
	
	}
	
	public void sum()
	{
		int j=25;
		int k=27;
		int l=j+k;
		System.out.println("******");
		System.out.println(l);
	}
	
	
}
