package OrganizationPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.Java_Utility;

public class CreateCampaignsPage {

	//initalization
			public CreateCampaignsPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//img[@alt='Create Campaign...']")
			private WebElement plusImg;
			
			@FindBy(name="campaignname")
			private WebElement createCampaigns;
			
			@FindBy(xpath="//img[@alt='Select']")
			private WebElement selectButton;
			
			@FindBy(name="search_text")
			private WebElement productNameSwitching;
			
			@FindBy(name="search")
			private WebElement productSearchSwitching;
			
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement saveButton;

			public WebElement getPlusImg() {
				return plusImg;
			}

			public WebElement getCreateCampaigns() {
				return createCampaigns;
			}

			public WebElement getSelectButton() {
				return selectButton;
			}

			public WebElement getProductNameSwitching() {
				return productNameSwitching;
			}

			public WebElement getProductSearchSwitching() {
				return productSearchSwitching;
			}

			public WebElement getSaveButton() {
				return saveButton;
			}
			//BusinessLogics
			public void clickplusImg()
			{
				plusImg.click();
			}
			public void campaignsName(String campNAme)
			{
				createCampaigns.sendKeys(campNAme);
			}
			public void selectplusButton()
			{
				selectButton.click();
			}
			
			public void productNameSwitching(String prdName)
			{
				productNameSwitching.sendKeys(prdName);
}
			public void searchProductdata()
			{
				productSearchSwitching.click();
				}
			public void saveButton()
			{
				saveButton.click();
				}
			public void dynamicData(WebDriver driver,String prdName)
			{
				driver.findElement(By.xpath("//a[text()='"+prdName+"']")).click();
			}
}
