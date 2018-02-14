package testPkg;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.chrome.driver", ".//lib/drivers/chromedriver.exe");		
	    WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        driver.get("http://www.bankofcanada.ca/"); 
	        
	        driver.manage().window().maximize();
	        
	        Actions actBuild = new Actions(driver);
	        
	        //Window 1
	        String firstwindowhandle = driver.getWindowHandle();
	        actBuild.click(driver.findElement(By.linkText("ABOUT THE BANK"))).perform();        
	        
	        
	        //Window 2
	        actBuild.moveToElement(driver.findElement(By.linkText("who runs the Bank")));
	        actBuild.keyDown(Keys.SHIFT);
	        actBuild.click();
	        actBuild.perform();
	        
	        // Window 3
	        actBuild.clickAndHold(driver.findElement(By.linkText("ABOUT THE BANK"))).perform();
	        actBuild.moveToElement(driver.findElement(By.linkText("Board of Directors")));
	       
	        actBuild.click();
	        Action tabOpen= actBuild.build();	        
	        tabOpen.perform();
	        
	        // Window 4
	        actBuild.clickAndHold(driver.findElement(By.linkText("ABOUT THE BANK"))).perform();	        
	        actBuild.moveToElement(driver.findElement(By.linkText("Frequently Asked Questions")));
	        //actBuild.keyDown(Keys.SHIFT);
	        actBuild.click();	        
	        Action tabOpen1= actBuild.build();	        
	        tabOpen1.perform();
	        
	        ArrayList<String> windows = new ArrayList<String> (driver.getWindowHandles());
	        
	        driver.switchTo().window(windows.get(2));
	      // Window 5
	        actBuild.moveToElement(driver.findElement(By.linkText("Carolyn Wilkins")));
	        //actBuild.keyDown(Keys.SHIFT);
	        actBuild.click();
	        actBuild.perform();
	        
	        //Window 6
	        driver.switchTo().defaultContent();
	        
	        actBuild.keyUp(Keys.SHIFT).perform();
	        driver.findElement(By.xpath("//img[@alt='Bank of Canada']")).click();
	        actBuild.moveToElement(driver.findElement(By.linkText("Annual Report 2015")));
	        actBuild.keyDown(Keys.SHIFT);
	        actBuild.click();
	        actBuild.perform();
	        	       
	        windows = new ArrayList<String> (driver.getWindowHandles());
	        
	        int n = windows.size();
	        
	        System.out.println("Total active Windows = "+  n);
	        
	        System.out.println("First Window handle = "+  firstwindowhandle);
	        
	        String seconndwindowhandle = (String) windows.toArray()[1];
	        System.out.println("Second Window handle = "+  seconndwindowhandle);
	        
	        String thirdwindowhandle = (String) windows.toArray()[2];
	        System.out.println("Third Window handle = "+  thirdwindowhandle);
	        
	        String fourthwindowhandle = (String) windows.toArray()[3];
	        System.out.println("Fourth Window handle = "+  fourthwindowhandle);
	        
	        String fifthwindowhandle = (String) windows.toArray()[4];
	        System.out.println("Fifth  Window handle = "+  fifthwindowhandle);
	        
	        String sixthwindowhandle = (String) windows.toArray()[5];
	        System.out.println("Sixth  Window handle = "+  sixthwindowhandle);
	        
	        driver.switchTo().window(firstwindowhandle);
	        driver.close();
	        

	        for (int i=1; i< windows.size(); i++ )
	        {
	        	driver.switchTo().window((String) windows.toArray()[i]);
	        	//System.out.println(i + " Window handle = "+  (String) windows.toArray()[i]);
		        driver.close();
	        }
	        
	        driver.quit();
	        
	        
	}

}
