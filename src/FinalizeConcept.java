
public class FinalizeConcept {

	//finalize method is used to clean up the memory
	//it relates to garbage collector.
	//finalize method is used for cleanup process before the garbage collector processing.
	//
	
	public void finalize()
	{
		System.out.println("finalize keyword");
	}
	
	
	public static void main(String[] args) {
		
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		
		f1=null;
		f2=null;
		System.gc();
	}
	
	

}
