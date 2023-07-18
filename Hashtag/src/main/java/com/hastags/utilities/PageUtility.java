package com.hastags.utilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.hastags.base.BaseSetUp;

public class PageUtility extends BaseSetUp {
public String getPageTitle(WebDriver driver) 
{
	String title=driver.getTitle();
	return title;
	}
public void clickOnElement(WebElement element)
{
    element.click();
    }
public void submitElement(WebElement element)
{
    element.submit();
    }
public void enterText(WebElement element,String Text)
{
	element.sendKeys(Text);
	}
public String getElementText(WebElement element)
{
	String text=element.getText();
	return text;
}
}