package com.qa.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.SpiceJet.com.Base;

public class FligtDetailsPage extends Base {
	
	
	@FindBy(xpath="//div[contains(text(),'For Student Discount Bookings')] ")
	WebElement For_Student_Discount_Bookings_text;
	
	
	public FligtDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Student_Discount_Bookings() {

		return For_Student_Discount_Bookings_text.isDisplayed();
	}
	
	

}
