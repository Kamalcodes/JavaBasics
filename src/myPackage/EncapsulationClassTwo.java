package myPackage;

public class EncapsulationClassTwo 
{
	public static void main(String args[])
	{
		EncapsulationClassOne obj=new EncapsulationClassOne();
		obj.setAge(25);
		obj.setName("kamal");
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		
	}
}
