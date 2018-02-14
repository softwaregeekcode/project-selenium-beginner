package testPkg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSrch_IE  
{
    public static void main(String[] args)
    {        
    	System.setProperty("webdriver.ie.driver","./lib/drivers/IEDriverServer.exe");
    	    	
        WebDriver driver = new InternetExplorerDriver(); 
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
