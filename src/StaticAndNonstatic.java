
public class StaticAndNonstatic {

	String name = "Tom";// non-static global variable
	static int age = 20;// static variable

	public static void main(String[] args) {
		// how to call static methods and variables?
		// 1. Direct calling:
		sum();
		// 2. Calling by class name
		StaticAndNonstatic.sum();

		System.out.println(age);
		System.out.println(StaticAndNonstatic.age);

		// how to call non static methods and variables
		StaticAndNonstatic obj = new StaticAndNonstatic();

		obj.sendmail();
		System.out.println(obj.name);

		// Can i access static methods by using object reference? YES
		obj.sum();// warning will be given

	}

	public void sendmail()// non static method
	{
		System.out.println("sendmail");
	}

	public static void sum()// static method
	{
		System.out.println("sum method");
	}

}
