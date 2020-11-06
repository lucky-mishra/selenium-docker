package org.com.webdriver.Docker.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	private WebDriverWait wait ;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		this.wait= new WebDriverWait(driver, 3000L);
		PageFactory.initElements(driver, this);


	}
	@FindBy(id="header-mobile-drawer-focus-start")
	private WebElement Shop;

	@FindBy(name="search")
	private WebElement search;

	public void LaunchURL() {
		this.driver.get("https://wwwqa.carmax.com/");
		this.wait.until(ExpectedConditions.visibilityOf(Shop));

	}
	





}
