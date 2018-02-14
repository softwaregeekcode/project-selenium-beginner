package testPkg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver = new FirefoxDriver(); 
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        driver.get("http://nunzioweb.com/iframes-example.htm"); 
	        
	        driver.manage().window().maximize();
	        
	        int size = driver.findElements(By.tagName("iframe")).size();
	        
	        System.out.println(size);
	        
	        driver.switchTo().frame(0);	        
	        driver.findElement(By.xpath("//button[@aria-label='Mute Toggle']")).click();	        
	        driver.switchTo().defaultContent();
	        
	        driver.switchTo().frame(driver.findElement(By.name("frame")));
	        driver.findElement(By.linkText("Autoscroll on/off")).click();	        
	        driver.switchTo().defaultContent();
	        
	        driver.findElement(By.name("Main")).click();
	        
	        //driver.quit();
	        
	        
	}

}
