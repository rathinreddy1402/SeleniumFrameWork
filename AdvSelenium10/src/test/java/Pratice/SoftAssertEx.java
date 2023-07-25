package Pratice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(false, true);
		System.out.println("Step4");
		System.out.println("Step5");
	    soft.assertAll();
	}
	@Test
	public void m2()
	{
		String expDAta = "Qspiders";
		String actData = "qspider";
		SoftAssert Soft = new SoftAssert();
		Soft.assertEquals(actData, expDAta);
		Soft.assertAll();
	}
}
