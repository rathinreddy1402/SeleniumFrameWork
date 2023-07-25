package OrganizationPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductPage {

	
		//initalization
		public DeleteProductPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[text()='Products']")
		private WebElement navigateProductTable;
		
		@FindBy(xpath="//input[@value='Delete']")
		private WebElement DeleteProduct;

		public WebElement getNavigateProductTable() {
			return navigateProductTable;
		}

		public WebElement getDeleteProduct() {
			return DeleteProduct;
		}
		
		public void productTable()
		{
			navigateProductTable.click();
		}
		public void deletePrdData( )
		{
			DeleteProduct.click();
		}

	}


