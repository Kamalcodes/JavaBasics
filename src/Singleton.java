
public class Singleton
{

	//How to design singleton class
	//1. Make constructor as private.
	//2. write a public static method(getInstance) that has return type of object of this singleton class(Lazy initialization)
	
	
	private static Singleton singleton_instance=null;
	
	public	String str;
	
	
	private Singleton()
	{
		str= "hello am in singleton class";
	}
	
	public static Singleton getInstance()
	{
		if(singleton_instance==null)
		
			singleton_instance=new Singleton();
		
		return singleton_instance; 
	}
	
	
	
	
	public static void main(String[] args) {
			Singleton x=Singleton.getInstance();
			Singleton y=Singleton.getInstance();
			Singleton z=Singleton.getInstance();
			
			x.str=(x.str).toUpperCase();
			
			System.out.println(x.str);
	}

}
