package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_utility.JavaScriptUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptEX {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		JavaScriptUtility jslib=new JavaScriptUtility(driver);
		jslib.launchApplication("http://localhost:8888");

		WebElement UserName = driver.findElement(By.name("user_name"));
		jslib.sendKeys(UserName, "admin");
		
		WebElement Password = driver.findElement(By.name("user_password"));
		jslib.sendKeys(Password, "admin");
		
		WebElement login = driver.findElement(By.id("submitButton"));
		jslib.click(login);
		
	/*	String URL = jslib.getUrlOfCurrentPage();
	    System.out.println(URL);

	    String TITLe = jslib.getTitleOfCurrentPage();
	    System.out.println(TITLe);*/
	
		jslib.scrollDown();
		Thread.sleep(2000);
		jslib.scrollUp();
	}

}
