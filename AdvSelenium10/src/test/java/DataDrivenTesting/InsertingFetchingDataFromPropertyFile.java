package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertingFetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.setProperty("username", "admin");
		prop.setProperty("password", "admin");
		prop.setProperty("url", "http://localhost:8888");
		prop.setProperty("browser", "chrome");
		
		FileOutputStream fout = new FileOutputStream("./src/test/resources/commonData.properties");
		prop.store(fout, "common data");
		System.out.println("data written successfully");
		
		//To read data
		
		FileInputStream fin = new FileInputStream("./src/test/resources/commonData.properties");
		prop.load(fin);
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		String URL = prop.getProperty("url");
		String BROWSER = prop.getProperty("browser");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
	}

}
