package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver drv = new SafariDriver();
		drv.get("http://www.seleniumhq.org");
		

	}

}
