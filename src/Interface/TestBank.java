package Interface;

public class TestBank
{
	public static void main(String args[])
	{
		System.out.println(USBank.min_bal);
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.carloan();
		hs.educationLoan();
	
		
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
	
	
	
	
	}
	
	
	
}
