package Product;


import java.util.List;
import org.openqa.selenium.By;
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
import OrganizationPom.DeleteProductPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductAndDeleteTest extends BaseClass {

	@Test
	public void CreateProductAndDeleteTest() throws Throwable
	{
		File_Utility flib=new File_Utility();
		Excel_utility elib=new Excel_utility();
		Java_Utility jlib=new Java_Utility();
		WebDriver_Utility wlib=new WebDriver_Utility();
		
		//Launching the browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
		//login to application
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");
driver.get(URL);
wlib.maximizeScreen(driver);

LoginPage1 login=new LoginPage1(driver);
login.loginToApp(USERNAME, PASSWORD);
//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//driver.findElement(By.id("submitButton")).click();

//click on product link
HomePage home=new HomePage(driver);
home.productLink();
//driver.findElement(By.linkText("Products")).click();

//click on +sign
CreateProductPage productpage=new CreateProductPage(driver);
productpage.clickonPlusSign();
//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();

//java utility method
int ranNum = jlib.getRandomNum();
String productData = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;

productpage.productName(productData);
	//driver.findElement(By.name("productname")).sendKeys(productData);

productpage.saveButton(driver);
	//save the data
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//product table
DeleteProductPage deletePrd=new DeleteProductPage(driver);
deletePrd.productTable();
//driver.findElement(By.xpath("//a[text()='Products']")).click();
driver.findElement(By.xpath("//table[@class='lvt small']/tbody//td//a[text()='"+productData+"']"
		+ "/../preceding-sibling::td/input")).click();

deletePrd.deletePrdData();
//driver.findElement(By.xpath("//input[@value='Delete']")).click();

wlib.Alertaccept(driver);
//Alert alt = driver.switchTo().alert();
//alt.accept();

//validation
 List<WebElement> productList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));

 boolean flag=false;
 
 for(WebElement prdName:productList)
 {
	String actData = prdName.getText();
	if(actData.contains(productData))//	Markerting293.contains(iphone)
	{
		flag=true;
		break;
	}
 }
if(flag)
{
	System.out.println("product data is deleted");
}
else
{
	System.out.println("product data not deleted");
}
Thread.sleep(2000);
home.logout(driver);
	}	
	
}


