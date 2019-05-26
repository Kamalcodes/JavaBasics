
public class ConstructorwithThiskeyword {

	//class variables
	String name;
	int age;
	//this keyword is used to initialize the class variables.
	public ConstructorwithThiskeyword(String name,int age)
	{
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		ConstructorwithThiskeyword obj=new ConstructorwithThiskeyword("Tom",10);
		
	}
	
}
