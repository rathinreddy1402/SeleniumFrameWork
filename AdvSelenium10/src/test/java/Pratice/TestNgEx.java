package Pratice;

import org.testng.annotations.Test;


public class TestNgEx {

	@Test
	public void createContact()
		{
		System.out.println("ContactCreated");
	}
	
	@Test
	public void modifyContact()
	{
		System.out.println("ContactModified");
	}
	
	@Test(enabled = false)
	public void deleteContact()
	{
		System.out.println("ContactDeleted");
	}
}
