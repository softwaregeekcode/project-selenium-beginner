package com.browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", ".//driver/geckodriver");
		WebDriver drv = new FirefoxDriver();
		System.out.println("browser initiated");
		drv.get("http://www.seleniumhq.org");
		drv.quit();
		System.out.println("browser closed");
	}

}
