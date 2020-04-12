package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup2 {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			
	}
      public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(3000);
	Robot r =new Robot();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_G);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_5);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_2);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
     driver.close();
	
	
	

	}

}
