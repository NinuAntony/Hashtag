package com.hastags.testscripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hashtags.constants.Constants;
import com.hastags.base.BaseSetUp;
import com.hastags.joinuspage.joinuspage;
import com.hastags.utilities.ExcelUtility;
import com.hastags.joinuspage.joinuspage;

public class JoinUsTest extends BaseSetUp {
	joinuspage join;

  
  @Test (dataProvider= "UserCredentials", priority=2, description="TC001_Verify valid data")
  public void TC002_verifyCorrectData(String name,String phonenum,String emailid,String descr) throws InterruptedException 
  {
  	  join=new joinuspage(driver);
  	  join.enterName(name);
  	  join.enterMail(emailid);
  	join.enterPhone(phonenum);
  	join.enterdescription(descr);
  join.ApplyClick();
		
		/*
		 * String actual="something went wrong! please try again later"; String expected
		 * = join.validationMessage();
		 * 
		 * Assert.assertEquals(actual, expected);
		 */
		 
  	 
  	 
  }
   @DataProvider(name="UserCredentials")
   public Object[][]  UserCredentials() throws InvalidFormatException, IOException
   {
   Object[][] data=ExcelUtility.getDataFromExcel(System.getProperty("user.dir")+ Constants.EXCEL_PATH, "data");
   return data;
   }
}
  