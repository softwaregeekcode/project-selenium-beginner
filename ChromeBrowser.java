package com.browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver");
		WebDriver drv = new ChromeDriver();
		
		drv.get("http://www.seleniumhq.org");
		drv.quit();

	}

}
