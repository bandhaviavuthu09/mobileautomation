package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class D {

	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname)
	{

		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{

		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{

		System.out.println("APIloginHome");
	}
}
