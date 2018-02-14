package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.opera.driver", "..//libs/drivers/operadriver");
		WebDriver drv = new OperaDriver();
		
		drv.get("http://www.seleniumhq.org");
		drv.findElement(By.linkText("many browsers")).click();
		drv.findElement(By.linkText("browsers")).click();
		drv.quit();

	}

}
