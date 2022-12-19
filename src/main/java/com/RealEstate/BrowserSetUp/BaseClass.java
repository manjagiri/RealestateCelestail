package com.RealEstate.BrowserSetUp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	

	@BeforeMethod
	public void Setup() {

		WebDriver driver = BrowserManager.doBrowserSetup("chrome");
		DriverManager.setDriver(driver);
		DriverManager.getDriver().get();

	}

 













}
