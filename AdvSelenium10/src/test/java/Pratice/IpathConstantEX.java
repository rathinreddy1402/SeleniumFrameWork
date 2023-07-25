package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_utility.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IpathConstantEX {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		File_Utility flib=new File_Utility();
		String URL = flib.getStringKeyAndValue("url");
		driver.get(URL);
		
		WebElement USERNAME = driver.findElement(By.name("user_name"));
		USERNAME.sendKeys("admin");
		
		USERNAME.sendKeys(Keys.CONTROL,"a");
		USERNAME.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(1000);
		
		WebElement PASSWORD = driver.findElement(By.name("user_password"));
		PASSWORD.sendKeys(Keys.CONTROL,"v");
		
		driver.findElement(By.id("submitButton")).click();
		}

}
