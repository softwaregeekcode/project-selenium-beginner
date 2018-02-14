package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("http://www.google.com");
		drv.quit();

	}

}
