package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPDF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//pdfbox  -->dependency
//		PDDocument document = PDDocument.load("./src/test/resources/Selenium Cheat Sheet.!!-1.pdf");
		
		File file = new File("./src/test/resources/Selenium Cheat Sheet.!!-1.pdf");
		PDDocument document = PDDocument.load(file);
	
		
		//pagecount
		int pageCount = document.getNumberOfPages();
	System.out.println(pageCount);
	
	//read content
	PDFTextStripper pdfstipper = new PDFTextStripper();
//	String pdfText = pdfstipper.getText(document);
//	
//	System.out.println(pdfText);
	
	//set the pageNo and GetTheText
	
//	pdfstipper.setStartPage(4);
//	String forthPage = pdfstipper.getText(document);
//	System.out.println(forthPage);
	
	pdfstipper.setStartPage(3);
	pdfstipper.setEndPage(4);
	String mytext = pdfstipper.getText(document);
	System.out.println(mytext);
	
	document.close();
	}

}