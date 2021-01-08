package com.qa.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.SpiceJet.com.Base;

public class BookPage extends Base {

	@FindBy(xpath = "//input[@id=\"ctl00_mainContent_rbtnl_Trip_0\"]")
	WebElement OneWayradiobtn;

	@FindBy(xpath = "//input[@id=\"ctl00_mainContent_view_date2\"]")
	WebElement ReturnData;

	@FindBy(xpath = "//span[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")
	WebElement DeptTextFiled;

	@FindBy(xpath = "//span[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXTaction\"]")
	WebElement ArrivalTextFiled;	
	
	@FindBy(xpath = "//a[@value=\"BLR\"]")
	WebElement bangaLore;


	@FindBy(xpath = "(//a[@value=\"PNQ\"])[2]")
	WebElement pune;

	@FindBy(xpath = "(//a[@class=\"ui-state-default\"])[2]")
	WebElement departureDate;

	@FindBy(xpath = "//div[@id=\"divpaxinfo\"]")
	WebElement passenger;

	@FindBy(xpath = "//select[@id=\"ctl00_mainContent_ddl_Adult\"]")
	WebElement adultdropDown;

	@FindBy(xpath = "//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]")
	WebElement currency;

	@FindBy(xpath = "//input[@id=\"ctl00_mainContent_chk_StudentDiscount\"]")
	WebElement StudentCheckBox;

	@FindBy(xpath = "//input[@name=\"ctl00$mainContent$btn_FindFlights\"]")
	WebElement SearchLink;

	public BookPage() {
		PageFactory.initElements(driver, this);
	}

	public void clcikONOneWayRadioBtn() {
		OneWayradiobtn.click();
	}

	public void oneway_trip_returndate_field_disabled() {
		Assert.assertEquals(true, ArrivalTextFiled.isEnabled());
	}

	public void SelectDeptCityBangAndArrivalAsPune() {
		DeptTextFiled.click();
		bangaLore.click();

		ArrivalTextFiled.click();
		pune.click();

	}

	public void Select_dept_data_And_Adult_and_INR() {

		departureDate.click();
		passenger.click();

		Select select = new Select(adultdropDown);
		select.selectByVisibleText("5");
		Select select1 = new Select(currency);
		select1.selectByVisibleText("INR");

	}

	public void select_checkBoxForStudent() {
		StudentCheckBox.click();

	}

	public FligtDetailsPage Search_link() {
		SearchLink.click();
		return new FligtDetailsPage();

	}

}
