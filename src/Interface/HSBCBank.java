package Interface;

public class HSBCBank implements USBank,BrazilBank
{
	
	
	//overriding from usbank
	public void credit(){
	System.out.println("credit");
	}
	
	public void debit()
	{
		System.out.println("debit");
	}
	public void transfermoney()
	{
		System.out.println("transfermoney");
	}
	
	//hsbcBank method
	public void carloan()
	{
		System.out.println("carloan");
	}
	
	public void educationLoan()
	{
		System.out.println("educationLoan");
	}
	
	
	//overriding for BrazilBank
	public void mutualfund()
	{
		System.out.println("mutual fund");	}
	
	}
	
