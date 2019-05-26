
public class MethodOverloading
{
	public static void main(String args[])
	{
	
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(11, 12);
	
	//Method overloading - when method the names are same but parameters will be different in the
	//same class
	
	//you cannot a create method inside method
	//same method with same number of arguments not allowed within the same class
	// we can overload the main method as well.
	
	
}
	public static void main(int p) {
		
	}
	
	public static void main(int j,int k) {
		
	}
	
	
	
	
	
	public void sum()
	{
		System.out.println("o parameters");
	}
	
	public void sum(int i)
	{
		System.out.println("1 parameter");
		System.out.println(i);
	}
	
	
	public void sum(int j,int k)
	{
		System.out.println("2 input parameters");
		System.out.println(j+k);
	}
	
}