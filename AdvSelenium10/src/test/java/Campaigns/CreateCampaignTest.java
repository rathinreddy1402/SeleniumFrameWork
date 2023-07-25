package Campaigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.WebDriver_Utility;
import OrganizationPom.CreateCampaginsPage;
import OrganizationPom.HomePage;

import OrganizationPom.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignTest extends BaseClass {

	@Test
	public void createCampaignTest() throws Throwable {
		WebDriver_Utility wlib=new WebDriver_Utility();
//		wlib.implicitwait(driver);
//	  //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		File_Utility flib=new File_Utility();
//		String URL = flib.getStringKeyAndValue("url");
//		String USERNAME = flib.getStringKeyAndValue("username");
//		String PASSWORD = flib.getStringKeyAndValue("password");
//		driver.get(URL);
//wlib.maximizeScreen(driver);
////driver.manage().window().maximize();
////login pom class
//LoginPage1 login=new LoginPage1(driver);
//login.loginToApp(USERNAME, PASSWORD);

//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//driver.findElement(By.id("submitButton")).click();

HomePage home=new HomePage(driver);
home.clickMoreLink();
home.clickCampLink();
//driver.findElement(By.linkText("More")).click();
//driver.findElement(By.linkText("Campaigns")).click();

CreateCampaginsPage camp=new CreateCampaginsPage(driver);
camp.clickOnImg();
//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

Java_Utility jlib=new Java_Utility();
int ranNum = jlib.getRandomNum();
Excel_utility elib=new Excel_utility();
  String campData = elib.getExcelDataUsingDataFormatter("Campaigns", 2, 1)+ranNum;
  camp.campaignsName(campData);
//driver.findElement(By.name("campaignname")).sendKeys(campData);
  camp.saveCamp();
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
Thread.sleep(2000);

String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
{
	if(actData.contains(campData))
	{
		System.out.println("script pass");
	}
	else
	{
		System.out.println("script fail");
	}
}
/*WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
wlib.ActionsMoveToElement(driver, ele);
//driver.findElement(By.xpath("//a[.='Sign Out']")).click();
driver.findElement(By.linkText("Sign Out")).click();*/
home.logout(driver);

	}

}
