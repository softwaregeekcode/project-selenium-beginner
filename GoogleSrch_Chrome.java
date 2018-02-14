package testPkg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class GoogleSrch_Chrome  
{
    public static void main(String[] args)
    {        
    	System.setProperty("webdriver.chrome.driver", "./lib/drivers/chromedriver.exe");
    	    	
        WebDriver driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        driver.get("http://www.google.com"); 
        
        driver.findElement(By.id("lst-ib")).sendKeys("selenium");
        
        driver.findElement(By.name("btnG")).click();  
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.findElement(By.id("resultStats")).getText());
        
        System.out.println(driver.getTitle());
               
        driver.quit();
       
    }
}
