package beginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Beginner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "..//libs/drivers/chromedriver.exec");
		WebDriver drv = new ChromeDriver();
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drv.get("http://www.seleniumhq.org");
		drv.quit();

	}

}
