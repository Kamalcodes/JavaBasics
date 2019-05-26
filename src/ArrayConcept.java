
public class ArrayConcept {

	public static void main(String args[]) {
		// array: to store similar data type values in a array variable
		
		//Advantage- in array in a single variable i can save number of values
		
		//Disadvantage- size is fixed.
		
		
		// int array:
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		//System.out.println(i[4]);// ArrayIndex out of bound exception

		System.out.println(i.length);
		System.out.println(i[2]); 
		System.out.println(i[3]);
		System.out.println("*******");
		//printing all the value of array
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//char array
		char c[]=new char[4];
		c[0]='A';
		c[1]='B';
		c[2]='C';
		c[3]='D';
		
		System.out.println(c[2]);
		System.out.println("****");
		
		for(int k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		}
		
		//boolean Array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println(b[1]);
		System.out.println("*****");
		
		for(int l=0;l<b.length;l++)
		{
			System.out.println(b[l]);
		}
		
		System.out.println("*******");
		//String Array
		String str[]=new String[3];
		str[0]="hello";
		str[1]="Hi";
		str[2]="hw r u";
		System.out.println(str.length);
		for(int g=0;g<str.length;g++)
		{
			System.out.println(str[g]);
			
		}
		
		
		//Object Array:(Object is class)
		Object ob[]=new Object[3];
		ob[0]="Tom";
		ob[1]="21/05/210";
		ob[2]="@london";
		for(int m=0;m<ob.length;m++)
		{
			System.out.println(ob[m]);
		}
		
		
				
	}
}
