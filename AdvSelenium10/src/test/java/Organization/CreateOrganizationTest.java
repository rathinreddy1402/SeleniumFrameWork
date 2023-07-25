package Organization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.Java_Utility;
import Generic_utility.WebDriver_Utility;
import OrganizationPom.CreateCampaginsPage;
import OrganizationPom.CreateOrganizationPage;
import OrganizationPom.HomePage;
import OrganizationPom.ValidationPage;

public class CreateOrganizationTest extends BaseClass{

	@Test
	public void createOrganizationTest() throws Throwable {
		Java_Utility jlib=new Java_Utility();
		Excel_utility elib=new Excel_utility();
		HomePage home=new HomePage(driver);
		home.organizationLink();

CreateOrganizationPage org = new CreateOrganizationPage(driver);
org.clickOnImg();

int ranNumber = jlib.getRandomNum();
String orgName = elib.getExcelData("Organization", 1, 0)+ranNumber;
String phoneNum = elib.getExcelDataUsingDataFormatter("Organization", 2, 0);
String email = elib.getExcelDataUsingDataFormatter("Organization", 3, 0);
org.orgData(orgName, phoneNum, email);
Thread.sleep(2000);

Assert.assertEquals(false, true);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
Thread.sleep(2000);
 /*String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
{
	if(actData.contains(orgName))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

}*/
ValidationPage valid=new ValidationPage(driver);
String actData = valid.getOrgValidate().getText();
 // String actData = valid.validateOrgname();
//String actData = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
Assert.assertEquals(actData, orgName);
home.logout(driver);
	}
	
	}	




