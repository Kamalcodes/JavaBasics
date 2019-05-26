
public class ConstructorConcept {

	
	public ConstructorConcept()
	{
		System.out.println("Default Constructor");
	}
	public ConstructorConcept(int i)
	{
		System.out.println("1 parametrized constructor");
		System.out.println("the value of i is "+ i);
	}
	public ConstructorConcept(int i,int j)

	{
		System.out.println("with two parameters");
		System.out.println("the value i is "+i);
		System.out.println("the value of j is "+j);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(20,30);
		
		
	}
	
}
