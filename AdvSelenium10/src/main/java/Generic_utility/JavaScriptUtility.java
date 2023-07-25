package Generic_utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

JavascriptExecutor js;
	
	/**
	 * 
	 * @param driver
	 */
	public JavaScriptUtility(WebDriver driver)
	{
		js=(JavascriptExecutor)driver;
	}
	
	/**
	 * 
	 * @param url
	 */
	public void launchApplication(String url)
	{
		js.executeScript("window.location=arguments[0]", url);
	}
	
	
	/**
	 * 
	 * @param element
	 * @param data
	 */
	public void sendKeys(WebElement element,String data)
	{
		js.executeScript("arguments[0].value=arguments[1]",element,data);
	}
	/**
	 * 
	 * @param element
	 */
	public void click(WebElement element)
	{
		js.executeScript("arguments[0].click()", element);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getUrlOfCurrentPage()
	{
		String url = (String) js.executeScript("return window.location.href");
		return url;
	}
	/**
	 * 
	 * @return
	 */
	public String getTitleOfCurrentPage()
	{
		String title = (String) js.executeScript("return document.title");
		return title;
	}
	/**
	 * 
	 */
	public void scrollUp()
	{
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
	
	/***
	 * 
	 */
	public void scrollDown()
	{
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	/**
	 * this method is used for scrolling
	 * @param driver
	 * @param element
	 */
	public void javaScriptExecutor(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
}
