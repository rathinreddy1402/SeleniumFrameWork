package Campaigns;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.WebDriver_Utility;
import OrganizationPom.CreateCampaignsPage;
import OrganizationPom.CreateProductPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampWIthProductTest extends BaseClass {

	@Test
	public void createCampWIthProductTest() throws Throwable
	{
		
		WebDriver_Utility wlib=new WebDriver_Utility();
		Java_Utility jlib=new Java_Utility();
		Excel_utility elib=new Excel_utility();
		File_Utility flib=new File_Utility();
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");
		
        driver.get(URL);
        wlib.maximizeScreen(driver);
        
        LoginPage1 login=new LoginPage1(driver);
        login.loginToApp(USERNAME, PASSWORD);
        
/*driver.findElement(By.name("user_name")).sendKeys(USERNAME);
driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
driver.findElement(By.id("submitButton")).click();*/
        
        HomePage home=new HomePage(driver);
        home.productLink();
//driver.findElement(By.linkText("Products")).click();
        
        CreateProductPage createProduct=new CreateProductPage(driver);
        createProduct.clickonPlusSign();
//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();

int ranNum = jlib.getRandomNum();

 String ProductData = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;
 createProduct.productName(ProductData);
//driver.findElement(By.name("productname")).sendKeys(ProductData);
 createProduct.saveButton(driver);
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

 home.clickMoreLink();
 home.clickCampLink();
 //driver.findElement(By.linkText("More")).click();
//driver.findElement(By.linkText("Campaigns")).click();
 
 CreateCampaignsPage campPage=new CreateCampaignsPage(driver);
 campPage.clickplusImg();
//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

String campData = elib.getExcelDataUsingDataFormatter("Campaigns", 2, 1)+ranNum;
campPage.campaignsName(campData);
//river.findElement(By.name("campaignname")).sendKeys(campData);
campPage.selectplusButton();
//driver.findElement(By.xpath("//img[@alt='Select']")).click();

    wlib.switchWindow(driver, "Products&action");
    campPage.productNameSwitching(ProductData);
	//driver.findElement(By.name("search_text")).sendKeys(ProductData);
    campPage.searchProductdata();
	//driver.findElement(By.name("search")).click();
	Thread.sleep(2000);
	campPage.dynamicData(driver, ProductData);
	//driver.findElement(By.xpath("//a[text()='"+ProductData+"']")).click();
	
	wlib.switchWindow(driver, "Campaigns&action");
	campPage.saveButton();
   //driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		home.logout(driver);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
 }

}
