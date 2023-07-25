package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
//initalization
		public CreateOrganizationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//img[@alt='Create Organization...']")
		private WebElement clickimg;
		
		@FindBy(name="accountname")
		private WebElement Orgname;
		
		@FindBy(id="phone")
		private WebElement OrgPhone;
		
		@FindBy(id="email1")
		private WebElement OrgEmail;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveButton;
		
		//getter methods
		public WebElement getClickimg() {
			return clickimg;
		}

		public WebElement getOrgname() {
			return Orgname;
		}

		public WebElement getOrgPhone() {
			return OrgPhone;
		}

		public WebElement getOrgEmail() {
			return OrgEmail;
		}
		public WebElement getSaveButton() {
			return saveButton;
		}
		
		//businessLogics
		/**
		 * This method is used to click on +sign
		 */
		public void clickOnImg()
		{
			clickimg.click();
		}
		/**
		 * This method is used to pass orgname,phonenUm,Email
		 * @param orgName
		 * @param phoneNum
		 * @param email
		 */
		public void orgData(String orgName,String phoneNum,String email)
		{
			Orgname.sendKeys(orgName);
			OrgPhone.sendKeys(phoneNum);
			OrgEmail.sendKeys(email);
		}
		public void clickSaveButton()
		{
			saveButton.click();
		}
}
