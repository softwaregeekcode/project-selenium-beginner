package testPkg;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", ".//lib/drivers/chromedriver.exe");		
	    WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        driver.get("http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm#.Vvt66Pl95SZ"); 
	        
	        driver.manage().window().maximize();
	        
	        Alert alert = driver.switchTo().alert();

	        String alertText = alert.getText();
	        
	        System.out.println(alertText);
	        

	        //alert.accept();

	        alert.dismiss();
	        
	        driver.quit();	
	        
	        
	}

}
