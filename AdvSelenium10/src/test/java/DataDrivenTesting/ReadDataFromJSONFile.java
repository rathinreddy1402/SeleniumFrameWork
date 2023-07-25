package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromJSONFile {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		// TODO Auto-generated method stub
		File file = new File("./src/test/resources/JsonData.json");
		
		//java script object notation
		ObjectMapper obj = new ObjectMapper();
		JsonNode jsonData = obj.readTree(file);
		
		String USERNAME = jsonData.get("username").asText();
		String PASSWORD = jsonData.get("password").asText();
		String URL = jsonData.get("url").asText();

		//its working
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
	}

}
