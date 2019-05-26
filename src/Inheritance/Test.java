package Inheritance;

public class Test 
{
	public static void main(String args[])
	{
//		static Polimorphism ---compile time polymorphism
//		BMW b=new BMW();
//		b.start();
//		b.stop();
//		b.refuel();
//		b.safety();
//		b.engine();
//		
//		System.out.println("*******");
//		
//		Car c=new Car();
//		c.start();
//		c.stop();
//		c.refuel();
//		c.engine();
//		
//		//top casting
//		Car c1=new BMW();
//		c1.start();
//		c1.stop();
//		c1.refuel();
		
		//Down Casting
//		int a =10;
//		int b=30;
//		int c=40;
//		
//		if (a>b & a>c)
//		{
//			System.out.println("a is greatest");
//		}
//		else if(b>a & b>c)
//		{
//			System.out.println("b is greatest");
//		}
//		else 
//		{
//			System.out.println("c is greatest");
//		}
		
		
		
//	int i=1;
//	while(i<=10)
//	{
//		System.out.println(i);
//	i=i+1;
//	}

//	for(int i=10;i>=-10;i--)
//	{
//		System.out.println(i);
//	}
		
//		int i= 1;
//		int b=++i;
//		System.out.println(i+"  "+b);
//		
		
		int i[]=new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[1]);
		System.out.println(i.length);
		System.out.println("*******");
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(
				i[j]);
		}
		
		
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.33;
		d[2]=14.56;
		
		System.out.println(d[2]);
		
		System.out.println("**********");
		
		Object ob[]=new Object[6];
		ob[0]=10;
		ob[1]=12.33;
		ob[2]="ch";
		ob[3]=true;
		
		System.out.println(ob[2]);
		
		
		
		
		
	}
}
