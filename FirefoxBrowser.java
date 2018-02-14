package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "..//libs/drivers/geckodriver");
		WebDriver drv = new FirefoxDriver();
		drv.get("http://www.seleniumhq.org");
		drv.findElement(By.linkText("many browsers")).click();
		drv.findElement(By.linkText("browsers")).click();
		drv.quit();

	}

}
