package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//libs/drivers/chromedriver");
		WebDriver drv = new ChromeDriver();
		drv.get("http://www.seleniumhq.org");
		drv.findElement(By.id("menu_download")).click();
		drv.findElement(By.linkText("previous releases")).click();
		

	}

}
