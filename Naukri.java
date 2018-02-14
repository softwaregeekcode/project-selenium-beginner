package testPkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver(); 
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        
	        driver.get("http://my.naukri.com/manager/createacc2.php?othersrcp=22536&wExp=N"); 
	        
	        driver.manage().window().maximize();
	        
	        List<WebElement> elem = driver.findElements(By.cssSelector("input[type = \"checkbox\"]"));
	        
	        for(WebElement chk:elem)
	        {
	        	chk.click();
	        }         
	        
	        //driver.quit();
	        
	        
	}

}
