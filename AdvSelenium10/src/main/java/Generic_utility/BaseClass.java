package Generic_utility;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import OrganizationPom.HomePage;
import OrganizationPom.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
public	WebDriver driver;
public static WebDriver Sdriver;
@BeforeSuite(groups = {"smokeTest","regressionTest"})
public void beforeSuite() {
	System.out.println("DataBAse COnnection");
}
@BeforeTest(groups = {"smokeTest","regressionTest"})
public void beforeTest()
{
	System.out.println("Parallel Execution");
}
//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void beforeClass() throws Throwable
	{
	//public void beforeClass(String BROWSER) throws Throwable
	//{
		File_Utility flib=new File_Utility();
		String BROWSER = flib.getStringKeyAndValue("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		Sdriver=driver;
	}
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void beforeMethod() throws Throwable
	{
		WebDriver_Utility wlib=new WebDriver_Utility();
		File_Utility flib=new File_Utility();
		wlib.implicitwait(driver);
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");
		driver.get(URL);
		wlib.maximizeScreen(driver);
		
		//calling from POM
		LoginPage1 login=new LoginPage1(driver);
		login.loginToApp(USERNAME, PASSWORD);
	}
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void afterMethod()
	{
//		HomePage home=new HomePage(driver);
//		home.logout(driver);
	}
	
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void afterClass()
	{
		driver.close();
	}
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void afterSuite() {
		System.out.println("DataBAse COnnection");
	}
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void afterTest()
	{
		System.out.println("Parallel Execution");
	}
}
