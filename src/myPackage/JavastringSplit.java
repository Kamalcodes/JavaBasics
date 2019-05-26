package myPackage;

public class JavastringSplit
{
		public static void main(String args[])
		{
	
			String str="Jan-Feb-March";
			String[]temp;
			String delimeter="-";
			temp=str.split(delimeter);
			for(int i=0;i<temp.length;i++)
			{
				System.out.println(temp[i]);
				System.out.println("");
			}
		}			
}