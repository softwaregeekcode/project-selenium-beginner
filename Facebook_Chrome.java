package beginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//libs/drivers/chromedriver");
		WebDriver drv = new ChromeDriver();
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drv.get("http://www.facebook.com");
		drv.manage().window().maximize();

		drv.findElement(By.name("firstname")).sendKeys("John");
		drv.findElement(By.name("lastname")).sendKeys("kevin");
		drv.findElement(By.id("u_0_3")).sendKeys("8995578989");
		// text box - css selector
		drv.findElement(By.cssSelector("input[aria-label = \"Re-enter email or mobile number\"]"))
				.sendKeys("3698532458");
		// text box-masked
		drv.findElement(By.cssSelector("input[name = \"reg_passwd__\"]")).sendKeys("password@1");

		// DROPDOWN - Select by Index
		Select day = new Select(drv.findElement(By.id("day")));
		day.selectByIndex(4);

		// DROPDOWN - Select by Value
		Select month = new Select(drv.findElement(By.id("month")));
		month.selectByValue("4");

		// DROPDOWN - Select by visibleText
		Select yr = new Select(drv.findElement(By.id("year")));
		yr.selectByVisibleText("2001");

		// Radio Buttons
		drv.findElement(By.id("u_0_7")).click();

		// Submit Button Click
		drv.findElement(By.name("websubmit")).click();

		// link-text
		drv.findElement(By.linkText("Terms")).click();

		// partial link-text
		drv.findElement(By.partialLinkText("Policy")).click();
		drv.quit();

	}

}
