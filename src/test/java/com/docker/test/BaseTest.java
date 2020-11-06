package com.docker.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;
	@BeforeTest
	public void setUpDriver(ITestContext ctx) throws MalformedURLException {
		String host="localhost";
		String testname=ctx.getCurrentXmlTest().getName();
		DesiredCapabilities dc=null;
		
		if(System.getProperty("HUB_HOST") !=null) {
			host=System.getProperty("HUB_HOST");
			
		}
		//complete url is the address of Hub (server)
		
		String completeURL="http://"+ host+ ":4444/wd/hub";
		
		
		if(System.getProperty("BROWSER") !=null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
			dc=DesiredCapabilities.firefox();
			dc.setCapability("name", testname);
			this.driver = new RemoteWebDriver(new URL(completeURL), dc);
		
		}else
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.setCapability("name", testname);
			this.driver = new RemoteWebDriver(new URL(completeURL), options);
			//options.addExtensions(new File("/path/to/extension.crx"));
			//ChromeDriver driver = new ChromeDriver(options);
			//dc= DesiredCapabilities.chrome();
		}
		
		
		
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\9500530\\eclipse-workspace\\logframework\\src\\main\\java\\chromedriver.exe");
		//this.driver=new ChromeDriver();
		
	}
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
				
		
	}
	

}
