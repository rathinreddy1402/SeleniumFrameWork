package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaginsPage {

	//initalization
		public CreateCampaginsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//img[@alt='Create Campaign...']")
		private WebElement clickplusimg;
		
		@FindBy(name="campaignname")
		private WebElement campName;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveButton;
		
		//getter methods
		public WebElement getClickplusimg() {
			return clickplusimg;
		}

		public WebElement getCampName() {
			return campName;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		//BusinessLogics
		public void clickOnImg()
		{
			clickplusimg.click();
		}
		public void campaignsName(String CampNAme)
		{
			campName.sendKeys(CampNAme);
		}
	public void saveCamp()
	{
		saveButton.click();
	}
		
}
