package com.docker.test;

import org.com.webdriver.Docker.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	private String vehiclemake;
	private String vehicleModel;
	
	@Test
	@Parameters({"make", "model"})
	public void homeTest(String vehiclemake, String vehicleModel) {
		HomePage home = new HomePage(driver);
		home.LaunchURL();
		Assert.assertEquals(5, 5);
		System.out.println(vehiclemake+"-----"+vehicleModel);
		
	}
	@Test (dependsOnMethods="homeTest")
	public void registrationTest() {
		Assert.assertEquals(5, 5);
		
		
	}
	@Test (dependsOnMethods="registrationTest")
	public void loginTest() {
		
		Assert.assertEquals(5, 5);
		
	}
	@Test (dependsOnMethods="loginTest")
	public void logoutTest() {
		
		Assert.assertEquals(5, 5);
		
		
	}
	@Test (dependsOnMethods="logoutTest")
	public void bookTest() {
		
		Assert.assertEquals(5, 5);
		
		
	}

}
