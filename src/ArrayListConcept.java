import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept 
{
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());
		
		ar.add(500);
		ar.add(600);
		ar.add(700);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(12.256);
		ar.add(true);
		ar.add('c');
		
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		//ar1.add(25);
		//ar1.add("");// here in this method only Integer acceptable.
		
		//ArrayList<Character> ar2=new ArrayList<Character>();
		
		//ar2.add("");//here only Character acceptable.
		//ar2.add('C');
		
		System.out.println("********");
		
		Employee e1=new Employee("Naveen",29,"QA");
		Employee e2=new Employee("Tom", 31,"QA");
		Employee e3=new Employee("Jai",24,"QA");
		
		ArrayList <Employee> ar4=new ArrayList<Employee>();
		 	ar4.add(e1);
		 	ar4.add(e2);
		 	ar4.add(e3);
		 	
		//Iterator to traverse the values
		 	Iterator<Employee> it=ar4.iterator();
		 	while(it.hasNext())
		 	{
		 		Employee emp=it.next();
		 		
		 		System.out.println(emp.name);
		 		System.out.println(emp.age);
		 		System.out.println(emp.dept);
		 	}
		 	
		 	System.out.println("********");
		 	//***********
		 	//addAll()
		 	ArrayList ar5=new ArrayList();
		 	ar5.add("test");
		 	ar5.add("Selenium");
		 	ar5.add("QA");
	
		 	ArrayList ar6=new ArrayList();
		 	ar6.add("dev");
		 	ar6.add("Java");
		 	ar6.add("JavaScript");
		 	
		 	ar5.addAll(ar6);
		 	
		 	
		 	for(int i=0;i<ar5.size();i++)
		 	{
		 		System.out.println(ar5.get(i));
		 	}
		 	
		 	//removeAll()
		 	ar5.removeAll(ar6);
		 	for(int i=0;i<ar5.size();i++)
		 	{
		 		System.out.println(ar5.get(i));
		 	}
		 	
		 	System.out.println("********");
		 	//retainAll()
		 	
		 	ArrayList ar7=new ArrayList();
		 	ar7.add("test");
		 	ar7.add("Java");
		 	
		 	ArrayList ar8=new ArrayList();
		 	ar8.add("test");
		 	ar8.add("Java1");
		 	
		 	ar7.retainAll(ar8);
		 	for(int i=0;i<ar7.size();i++)
		 	{
		 		System.out.println(ar7.get(i));
		 	}
	}
}
