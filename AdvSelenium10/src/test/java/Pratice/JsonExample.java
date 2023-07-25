package Pratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JsonExample {

	public static void main(String[] args) throws Throwable, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		File file = new File("src/test/resources/JsonData.json");
        ObjectMapper jsondata = new ObjectMapper();
		JsonNode data = jsondata.readTree(file);
	
	String URL = data.get("url").asText();
	String USERNAME = data.get("username").asText();
	String PASSWORD = data.get("password").asText();
	driver.get(URL);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	}

}
