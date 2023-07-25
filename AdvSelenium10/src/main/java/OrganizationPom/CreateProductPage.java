package OrganizationPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.WebDriver_Utility;

public class CreateProductPage {

	//initalization
		public CreateProductPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//img[@title='Create Product...']")
		private WebElement imgSign;
		
		@FindBy(name="productname")
		private WebElement productName;
		
		@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
		private WebElement saveButton;

		public WebElement getImgSign() {
			return imgSign;
		}

		public WebElement getProductName() {
			return productName;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		public void clickonPlusSign()
		{
			imgSign.click();
		}
		public void productName(String productNAme)
		{
			productName.sendKeys(productNAme);
		
		}
		public void saveButton(WebDriver driver)
		{
			WebDriver_Utility wlib=new WebDriver_Utility();
			WebElement saveButton = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
			wlib.javaScriptExecutor(driver, saveButton);
			//saveButton.click();
			saveButton.click();
			
		}
		
		
}
