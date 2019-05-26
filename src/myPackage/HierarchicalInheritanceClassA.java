package myPackage;

public class HierarchicalInheritanceClassA 
{
public static void main(String args[]){  
		
		// Class B extends Class A
		// Class C extends Class A
		// Here I am creating an instance of ClassC
		
		MultipleInheritanceClassC obj = new MultipleInheritanceClassC();
		
		// Using object of ClassC, I can call methods of ClassA and ClassC.. 
		// Its just because ClassC extends ClassA
		// Here ClassB cant call methods of ClassB because there is no relation between ClassC and ClassB 
		
		obj.methodClassOneA();
		obj.myMethodClassOneC();
  
	}
}
