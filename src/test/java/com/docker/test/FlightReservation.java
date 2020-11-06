package com.docker.test;

import org.com.webdriver.Docker.Page.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlightReservation extends BaseTest {
	private String vehiclemake;
	private String vehicleModel;
	@BeforeTest
	@Parameters({"make", "model"})
	public void setUpParameters(String make, String model) {
		this.vehiclemake=make;
		this.vehicleModel=model;
		System.out.println(vehiclemake +" --- "+vehicleModel);
		
		
	}
	
	@Test
	public void bookFlightTest() {
		HomePage home = new HomePage(driver);
		home.LaunchURL();
		Assert.assertEquals(5, 5);
		
	}
	@Test
	public void registrationFlightTest() {
		
		Assert.assertEquals(5, 5);
		
	}
	@Test
	public void loginFlightTest() {
		
		Assert.assertEquals(5, 5);
		
	}
	@Test
	public void logoutFlightTest() {
		
		Assert.assertEquals(5, 5);
	}		

}
