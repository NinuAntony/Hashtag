package com.hastags.joinuspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hastags.base.BaseSetUp;
import com.hastags.utilities.TestHelper;

public class joinuspage extends TestHelper {
	
	public WebDriver driver;

	public joinuspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	  
	    private final String _name = "//input[@name='name']";
		@FindBy(xpath = _name)
		private WebElement name;
		
		
		private final String _email = "//input[@name='email']";
		@FindBy(xpath = _email)
		private WebElement email;
		
		private final String _phoneno = "//input[@name='phone']";
		@FindBy(xpath = _phoneno)
		private WebElement phoneno;
		
		private final String _resume = "//input[@name='resume']";
		@FindBy(xpath = _resume)
		private WebElement resume;
		
		private final String _description = "//textarea[@name='description']";
		@FindBy(xpath = _description)
		private WebElement description;
		
		private final String _applynow="//button[text()='APPLY NOW']";
		@FindBy(xpath = _applynow)
		private WebElement applynow;
		
		private final String _validationMessage = "(//p[@class='text-danger'])[4]";
		@FindBy(xpath = _validationMessage)
		private WebElement validationMessage;
		
  

public void enterName(String Name) {

	page.enterText(name, Name);
}

public void enterMail(String emailid) {
	page.enterText(email, emailid);
}

public void enterPhone(String phonenum) {
	page.enterText(phoneno, phonenum);
}

public void enterdescription(String descr) {
	page.enterText(description, descr);
	
}

public void enterResume(String Text)
{
	page.enterText(resume,Text);
	}

public void ApplyClick() {
	page.clickOnElement(applynow);
}

public String validationMessage() {
	String s = page.getElementText(validationMessage);
	return s;
}
}