package testPkg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class BocActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver(); 
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        
	        driver.get("http://www.bankofcanada.ca/"); 
	        
	        driver.manage().window().maximize();
	        
	        
	        Actions actBuild = new Actions(driver);
	        
	        //Click
	        actBuild.click(driver.findElement(By.id("menu-item-148249"))).perform(); 
	        //ContextClick
	        actBuild.contextClick(driver.findElement(By.linkText("who runs the Bank"))).perform();
	        actBuild.sendKeys("t").perform();
	        //actBuild.click(driver.findElement(By.linkText("Board of Directors"))).perform(); 

	        
	        //Click MouseHover Menu Item
	        actBuild.moveToElement(driver.findElement(By.id("menu-item-148249"))).perform();
	        actBuild.moveToElement(driver.findElement(By.linkText("Board of Directors"))).perform();
	        actBuild.moveToElement(driver.findElement(By.xpath("//a[@href='http://www.bankofcanada.ca/about/history/']")));
	        actBuild.click().perform();
	        actBuild.perform();
	        
	        //
	        actBuild.moveToElement(driver.findElement(By.id("menu-item-148249"))).perform();
	        actBuild.moveToElement(driver.findElement(By.linkText("Board of Directors")))
	        .click();
	        Action clicking= actBuild.build();	        
	        clicking.perform();
	        
	        
	        //EnterData in CAPS
	        WebElement elem = driver.findElement(By.id("search"));
	        actBuild.moveToElement(elem).click().keyDown(elem,Keys.SHIFT).sendKeys(elem,"personal loans");	        
	        Action DataEntry= actBuild.build();	        
	        DataEntry.perform();
	        
	        //driver.quit();
	        
	        
	}

}
