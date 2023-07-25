package Pratice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_utility.Excel_utility;

public class DataProviderEx3 {
	
	@Test(dataProvider="getData")
	public void bookTickets(String src,String dest)
	{
		System.out.println("book tickets from"+src+"to "+dest);
	}

@DataProvider
	public Object[][] getData() throws Throwable
	{
	Excel_utility elib=new Excel_utility();
	Object[][] value = elib.readMultipleData("DataProvider");
	
		return value;
		
	
}
}