package Pratice;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Generic_utility.WebDriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx2 {
@Test(dataProvider="getdata")
	public void m1(String orgName,String phoneNum,String emailId) throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys(orgName);
	driver.findElement(By.name("phone")).sendKeys(phoneNum);
	driver.findElement(By.id("email1")).sendKeys(emailId);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	Thread.sleep(1000);
	driver.quit();
}
@DataProvider
public Object[][] getdata()
{
	Random ran=new Random();
	int ranNum = ran.nextInt(1000);
	Object[][] obj = new Object[3][3];
	obj[0][0]="AAA"+ranNum;
	obj[0][1]="57654645254";
	obj[0][2]="jhfg@gmail.com";
	
	obj[1][0]="BBB"+ranNum;
	obj[1][1]="57654645254";
	obj[1][2]="jhjhgfjhg@gmail.com";
	
	obj[2][0]="CCC"+ranNum;
	obj[2][1]="55454645254";
	obj[2][2]="jhfg@gmail.com";
	return obj;
	
}
}