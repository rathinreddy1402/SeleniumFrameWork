package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//initalization
		public LoginPage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Declaration
		@FindBy(name="user_name")
		private WebElement userNameTextField;
		
//		webdriver driver=new chromedriver;
//		driver.findElement(by.name("user_name")).sendkeys("admin");
		
		@FindBy(name="user_password")
		private WebElement passWordTextField;
		
		//@FindBy(id="submitButton")
		//private WebElement loginButton;
		
	//	@FindBys({@FindBy(id="submitButton"),@FindBy(xpath="(//input[@value='Login'])[2]")})
	//	private WebElement loginButton;
		
		@FindAll({@FindBy(id="submitButton"),@FindBy(xpath="(//input[@value='Login'])[2]")})
		private WebElement loginButton;
		
		//getter methods
		public WebElement getUserNameTextField() {
			return userNameTextField;
		}

		public WebElement getPassWordTextField() {
			return passWordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		public void loginToApp(String username,String password)
		{
			userNameTextField.sendKeys(username);
			passWordTextField.sendKeys(password);
			loginButton.click();
		}
}
