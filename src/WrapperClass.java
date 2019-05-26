
public class WrapperClass 

{
	public static void main(String args[])
	{
		//here is the concept of wrapper classes
		
		String x="100";
		System.out.println(x+20);
		
		//Data conversion String to Integer
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Boolean
		
		//String to Double conversion
		String a="12.55";
		Double d=Double.parseDouble(a);
		System.out.println(d);
		
		//String to boolean conversion
		String sg="true";
		Boolean b=Boolean.parseBoolean(sg);
		System.out.println(b);
		
		//Integer to String conversion
		int ik=10;
		String st=String.valueOf(ik);
		System.out.println(st+20);
		
	}
}
