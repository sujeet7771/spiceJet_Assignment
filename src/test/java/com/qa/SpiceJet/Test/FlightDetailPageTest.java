package com.qa.SpiceJet.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.SpiceJet.Pages.BookPage;
import com.qa.SpiceJet.Pages.FligtDetailsPage;
import com.qa.SpiceJet.com.Base;

public class FlightDetailPageTest extends Base {
	BookPage bookpage;
	FligtDetailsPage flightdetailspage;

	public FlightDetailPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		init();
		bookpage = new BookPage();
		flightdetailspage = new FligtDetailsPage();

	}

	@Test
	public void verify_Student_Discount_Bookings() {
		bookpage.SelectDeptCityBangAndArrivalAsPune();
		bookpage.Select_dept_data_And_Adult_and_INR();
		bookpage.select_checkBoxForStudent();
		bookpage.Search_link();
		boolean studentDiscount = flightdetailspage.Student_Discount_Bookings();
		
		Assert.assertEquals(studentDiscount, true);

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();

	}

}
