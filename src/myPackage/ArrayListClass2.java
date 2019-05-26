package myPackage;
import java.util.ArrayList;
public class ArrayListClass2
{
	public static void main(String args[])
	{
		ArrayList arrList = new ArrayList();
		
		arrList.add("STM");
		arrList.add(987654321);
		
		for(Object arrListItem : arrList)
		{
			System.out.println("value of the ArrayList at the index " +arrList.indexOf(arrListItem)+"is"+arrListItem);
		}
	}
}
