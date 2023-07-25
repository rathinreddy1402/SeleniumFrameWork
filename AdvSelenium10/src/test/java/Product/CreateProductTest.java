package Product;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.WebDriver_Utility;
import OrganizationPom.CreateProductPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductTest extends BaseClass {

	@Test
	public void createProductTest()  throws Throwable {
		File_Utility flib=new File_Utility();
		Excel_utility elib=new Excel_utility();
		Java_Utility jlib=new Java_Utility();
		WebDriver_Utility wlib=new WebDriver_Utility();
		
		//Launching browser
//        WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
		//login to application
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");
driver.get(URL);
//maximizing the screen
wlib.maximizeScreen(driver);

LoginPage1 login=new LoginPage1(driver);
/*login.getUserNameTextField().sendKeys(USERNAME);
login.getPassWordTextField().sendKeys(PASSWORD);
login.getLoginButton().click();
login.loginToApp(USERNAME, PASSWORD);*/
login.loginToApp(USERNAME, PASSWORD);

/*driver.findElement(By.name("user_name")).sendKeys(USERNAME);
driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
driver.findElement(By.id("submitButton")).click();*/

//click on product link
//driver.findElement(By.linkText("Products")).click();

HomePage home=new HomePage(driver);
home.productLink();
//click on product link
//driver.findElement(By.linkText("Products")).click();

CreateProductPage productpage=new CreateProductPage(driver);

//click on +sign
productpage.clickonPlusSign();
//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
//to avoid duplicate(Random method)
int ranNum = jlib.getRandomNum();
//fetching data from excel sheet
String productData = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;
productpage.productName(productData);
//driver.findElement(By.name("productname")).sendKeys(productData);

//save data by scrolling

/*WebElement saveButton = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
wlib.javaScriptExecutor(driver, saveButton);
saveButton.click();*/
productpage.saveButton(driver);

Thread.sleep(3000);
//log out
home.logout(driver);
//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
