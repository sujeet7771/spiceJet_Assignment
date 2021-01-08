package com.qa.SpiceJet.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.SpiceJet.Pages.BookPage;
import com.qa.SpiceJet.Pages.FligtDetailsPage;
import com.qa.SpiceJet.com.Base;

public class BookPageTest extends Base {
	BookPage bookpage;
	FligtDetailsPage fligtDetailsPage;

	public BookPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		init();
		bookpage = new BookPage();
		fligtDetailsPage=new FligtDetailsPage();

	}

	// TO verify click On one way radio button
	@Test(priority = 1)
	public void verify_clcikONOneWayRadioBtn() {
		bookpage.clcikONOneWayRadioBtn();
	}

	// To verify the one way trip with return field is display or not

	@Test(priority = 1)
	public void verify_oneway_trip_returndate_field_disabled() {
		bookpage.clcikONOneWayRadioBtn();
		bookpage.oneway_trip_returndate_field_disabled();

	}

	// Select departure city as bangaluru arrival city is pune
	@Test(priority = 3)
	public void verify_SelectDeptCityBangAndArrivalAsPune() {
		bookpage.SelectDeptCityBangAndArrivalAsPune();

	}

	// Select Departure date as sysdate+2 ,5 Adults as passengers and currency INR
	@Test(priority = 4)
	public void verify_Select_dept_data_And_Adult_and_INR() {
		bookpage.oneway_trip_returndate_field_disabled();
		bookpage.SelectDeptCityBangAndArrivalAsPune();
		bookpage.Select_dept_data_And_Adult_and_INR();

	}

	// Select the checkbox for the student
	@Test(priority = 5)
	public void verify_select_checkBoxForStudent() {
		bookpage.oneway_trip_returndate_field_disabled();
		bookpage.SelectDeptCityBangAndArrivalAsPune();
		bookpage.Select_dept_data_And_Adult_and_INR();
		bookpage.select_checkBoxForStudent();

	}

	// click on search link
	@Test(priority = 6)
	public void verify_Search_link() throws InterruptedException {
		bookpage.oneway_trip_returndate_field_disabled();
		bookpage.SelectDeptCityBangAndArrivalAsPune();
		Thread.sleep(3000);
		bookpage.Select_dept_data_And_Adult_and_INR();
		bookpage.select_checkBoxForStudent();
		fligtDetailsPage=bookpage.Search_link();

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();

	}

}
