package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {
		
	/*	String key="webdriver.chrome.driver";
		String value="./src/main/resources/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();*/
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		
	/*	WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();*/
		
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}

}
