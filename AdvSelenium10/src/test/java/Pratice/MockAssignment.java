package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MockAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://www.amazon.in");
	      WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	      ele.sendKeys("samsung");
	      ele.submit();
	      
	 //     List<WebElement> names = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
	//      List<WebElement> Allprice = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//span[@class='a-price-whole']"));
	     List<WebElement> prices = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//span[@class='a-price-whole'][number(translate(text(),'₹,',''))<10000]"));
	     for(int i=0;i<prices.size();i++)
	     {
	    	 System.out.println(prices.get(i).getText());
		}		
	      
//	      for(int i=0;i<names.size();i++)
//	      {
//	    	  String text = Allprice.get(i).getText();
//	    	  String myPrice = text.replaceAll(",", "");//18,500, 18500
//	 	     int ActualPrice = Integer.valueOf(myPrice);
//	    	 
//	    	  if(ActualPrice<=5000)
//	    	  {
//	    		  System.out.println(names.get(i).getText()+" = "+Allprice.get(i).getText());
//	    	  }
//	      }
	      //driver.quit();
		
		
		//Assignment2
	/*	WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.prokabaddi.com/standings");
			String teamName="Jaipur Pink Panthers";
		
			System.out.println("palyed = "+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-play']")).getText());
		    System.out.println("won = "+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-won']")).getText());
			System.out.println("lost = "+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-lost']")).getText());
			System.out.println("draw = "+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-draw']")).getText());
			System.out.println("score diff = "+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data score-diff']")).getText());
			System.out.println("points = "+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data points']")).getText());
			
			List<WebElement> form = driver.findElements(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data form']//li"));
			System.out.println("Form");
			for(int i=0;i<form.size();i++)
			{
				System.out.print(form.get(i).getText());
			}	*/	
		
	}

}
