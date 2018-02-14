package beginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//libs/drivers/chromedriver");
		WebDriver drv = new ChromeDriver();
	/*	drv.findElement(By.id("u_0_e")).sendKeys("Hari");
		drv.findElement(By.id("u_0_g")).sendKeys("Purushotham");
		drv.findElement(By.name("reg_email__")).sendKeys("hari.purushotham@yahoo.co.in");
		drv.findElement(By.name("reg_email_confirmation__")).sendKeys("hari.purushotham@yahoo.co.in");
		drv.findElement(By.name("reg_passwd__")).sendKeys("Purushotham#8888");
		
		Select month = new Select(drv.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
		Select day = new Select(drv.findElement(By.name("birthday_day")));
		day.selectByValue("17");
		Select year = new Select(drv.findElement(By.id("birthday_year")));
		year.selectByVisibleText("1985");		
	*/	
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  drv.get("https://www.facebook.com/");
		  drv.manage().window().maximize();
		  
		  drv.findElement(By.name("firstname")).sendKeys("FirstName");
		  drv.findElement(By.name("lastname")).sendKeys("LastName");
		  drv.findElement(By.name("reg_email__")).sendKeys("firstname.lastmname@gmail.com");
	//	  drv.findElement(By.name("reg_email_confirmation__")).sendKeys("firstname.lastname@gmail.com");
		  drv.findElement(By.name("reg_passwd__")).sendKeys("Password#123");
		  
		 /* 
		  //Text-box - cssSelector
		        driver.findElement(By.cssSelector("input[aria-label = \"Re-enter email or mobile number\"]")).sendKeys("3698532458");
		       //Text-box  - Masked
		        driver.findElement(By.cssSelector("input[name = \"reg_passwd__\"]")).sendKeys("password@1");
		     */  
		  
		  // Drop-down Select Month
		  Select month = new Select(drv.findElement(By.id("month")));
		  month.selectByValue("5");
		  
		  // Drop-down select by Day
		  Select day = new Select(drv.findElement(By.id("day")));
		  day.selectByVisibleText("6");
		  
		  // Drop-down select by year
		  Select yr = new Select(drv.findElement(By.id("year")));
		  yr.selectByValue("1985");
		  
		  // radio button
		  drv.findElement(By.id("u_0_c")).click();
		  
		  // click submit button
		 // drv.findElement(By.name("websubmit")).click();
		  
		  // Link text
		  drv.findElement(By.linkText("Create a Page")).click();
		  
		  // partial link text
		  drv.findElement(By.partialLinkText("Facebook Lite")).click();
		  
		  drv.quit();
		
		drv.quit();
	}

}
