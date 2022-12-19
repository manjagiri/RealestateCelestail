package com.RealEstate.BrowserSetUp;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver driver) {
		 
		tldriver.set(driver);
	}
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}
	
	
	

}
