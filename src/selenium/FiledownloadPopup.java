package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiledownloadPopup {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			
	}

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("http://www.seleniumhq.org");
    driver.findElement(By.xpath("//a[.='Downloads'][1]"));
    
    
    	

	}

}
