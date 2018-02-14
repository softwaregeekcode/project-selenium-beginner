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

public class SwitchTabsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", ".//lib/drivers/chromedriver.exe");		
	    WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        driver.get("http://www.bankofcanada.ca/"); 
	        
	        driver.manage().window().maximize();
	        
	        Actions actBuild = new Actions(driver);
	        
	        //Tab 1
	        String firsttabhandle = driver.getWindowHandle();
	        actBuild.click(driver.findElement(By.linkText("ABOUT THE BANK"))).perform();        
	        
	        
	        //Tab 2
	        actBuild.moveToElement(driver.findElement(By.linkText("who runs the Bank")));
	        actBuild.keyDown(Keys.CONTROL);
	        actBuild.click();
	        actBuild.perform();
	        
	        //tab 3
	        actBuild.clickAndHold(driver.findElement(By.linkText("ABOUT THE BANK"))).perform();
	        actBuild.moveToElement(driver.findElement(By.linkText("Board of Directors")));
	        //actBuild.keyDown(Keys.CONTROL);
	        actBuild.click();
	        Action tabOpen= actBuild.build();	        
	        tabOpen.perform();
	        
	        //tab 4
	        actBuild.clickAndHold(driver.findElement(By.linkText("ABOUT THE BANK"))).perform();	        
	        actBuild.moveToElement(driver.findElement(By.linkText("Frequently Asked Questions")));
	        //actBuild.keyDown(Keys.CONTROL);
	        actBuild.click();	        
	        Action tabOpen1= actBuild.build();	        
	        tabOpen1.perform();
	        
	        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	        
	        driver.switchTo().window(tabs.get(2));
	        //tab 5
	        actBuild.moveToElement(driver.findElement(By.linkText("Carolyn Wilkins")));
	        //actBuild.keyDown(Keys.CONTROL);
	        actBuild.click();
	        actBuild.perform();
	        
	        //tab 6
	        //driver.switchTo().defaultContent();
	        
	        driver.switchTo().window(tabs.get(0));
	        
	        actBuild.keyUp(Keys.CONTROL).perform();
	        driver.findElement(By.xpath("//img[@alt='Bank of Canada']")).click();
	        actBuild.moveToElement(driver.findElement(By.linkText("Annual Report 2015")));
	        actBuild.keyDown(Keys.CONTROL);
	        actBuild.click();
	        actBuild.perform();
	        	       
	        tabs = new ArrayList<String> (driver.getWindowHandles());
	        
	        int n = tabs.size();
	        
	        System.out.println("Total active Tabs or Windows = "+  n);
	        
	        System.out.println("First Tab handle = "+  firsttabhandle);
	        
	        String secondtabhandle = (String) tabs.toArray()[1];
	        System.out.println("Second Tab handle = "+  secondtabhandle);
	        
	        String thirdtabhandle = (String) tabs.toArray()[2];
	        System.out.println("Third Tab handle = "+  thirdtabhandle);
	        
	        String fourthtabhandle = (String) tabs.toArray()[3];
	        System.out.println("Fourth Tab handle = "+  fourthtabhandle);
	        
	        String fifthtabhandle = (String) tabs.toArray()[4];
	        System.out.println("Fifth  Tab handle = "+  fifthtabhandle);
	        
	        String sixthtabhandle = (String) tabs.toArray()[5];
	        System.out.println("Sixth  Tab handle = "+  sixthtabhandle);
	        
	        driver.switchTo().window(firsttabhandle);
	        driver.close();
	        
	        for (int i=1; i< tabs.size(); i++ )
	        {
	        	driver.switchTo().window((String) tabs.toArray()[i]);
		        driver.close();
	        }
	        
	        driver.quit();	
	        
	        
	}

}
