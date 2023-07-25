package Generic_utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {

	/**
	 * This method is used for maximizing the screen
	 * @param driver
	 */
	public void maximizeScreen(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used for mimizing screen
	 * @param driver
	 */
	public void minimizeScreen(WebDriver driver)
	{
		//driver.manage().window().minimize()
	}
	/**
	 * This method will wait all the elements to be loaded in GUI
	 * @param driver
	 */
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	/**
	 * This method is used for switching from one window to another window
	 * @param driver
	 * @param partialText
	 */
	public void switchWindow(WebDriver driver,String partialText)
	{
		Set<String> allWindows = driver.getWindowHandles();
		 Iterator<String> id = allWindows.iterator();
			while(id.hasNext())
		 {
			 String win = id.next();
			 driver.switchTo().window(win);
			 String title = driver.getTitle();
			 
			 if(title.contains(partialText))
			 {
				 break;
			 }
			 }
	}
	/**
	 * This method is used to point the element
	 * 
     */
	public void ActionsMoveToElement(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
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
	/**
	 * This method
	 * @param driver
	 */
	public void Alertaccept(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public void Alertdismiss(WebDriver driver)
{ 
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		}
}
