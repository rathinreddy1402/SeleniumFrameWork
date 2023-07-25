package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_utility.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToVitger {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		File_Utility flib=new File_Utility();
				String URL = flib.getStringKeyAndValue("url");
				String USERNAME = flib.getStringKeyAndValue("username");
				String PASSWORD = flib.getStringKeyAndValue("password");
				driver.get(URL);
				
				
				driver.findElement(By.name("user_name")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
	
	
	}

}
