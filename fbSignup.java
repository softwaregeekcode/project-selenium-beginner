package testPkg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver(); 
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        
	        driver.get("https://www.facebook.com/r.php"); 
	        
	        driver.manage().window().maximize();
	        //Textbox - name
	        driver.findElement(By.name("firstname")).sendKeys("John");
	        
	        driver.findElement(By.name("lastname")).sendKeys("Kevin");
	        //Textbox  - id
	        driver.findElement(By.id("u_0_3")).sendKeys("3698532458");
	        //Textbox - cssSelector
	        driver.findElement(By.cssSelector("input[aria-label = \"Re-enter email or mobile number\"]")).sendKeys("3698532458");
	      //Textbox  - Masked
	        driver.findElement(By.cssSelector("input[name = \"reg_passwd__\"]")).sendKeys("password@1");
	        
	        //DROPDOWN - Select by Index	        
	        Select day = new Select(driver.findElement(By.id("day")));	        
	        day.selectByIndex(4);
	        
	      //DROPDOWN - Select by Value	        
	        Select month = new Select(driver.findElement(By.id("month")));	        
	        month.selectByValue("4");
	        
		      //DROPDOWN - Select by visibleText	        
	        Select yr = new Select(driver.findElement(By.id("year")));	        
	        yr.selectByVisibleText("2001");
	        
	        //Radio Buttons
	        driver.findElement(By.id("u_0_7")).click();	        
	        
	        //Submit Button Click
	        driver.findElement(By.name("websubmit")).click();
	        
	        //linktext
	        driver.findElement(By.linkText("Terms")).click();
	        
	        //partial linktext
	        driver.findElement(By.partialLinkText("Policy")).click();
	        
	        
	        
	        //driver.quit();
	        
	        
	}

}
