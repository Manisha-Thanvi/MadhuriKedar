package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SATE {
	private WebElement untb;	
	private WebElement pstb;
	private WebElement loginbtn;
	SATE(WebDriver driver){
		untb=driver.findElement(By.xpath("//input[@name='username']"));
		pstb=driver.findElement(By.xpath("//input[@type='password']"));
		loginbtn=driver.findElement(By.xpath("//div[.='Login ']"));
			
	}
	public void setUsername(String un) {
		 untb.sendKeys(un);
	}
	public void setPassword(String ps){

}
	public void clickLogin(){
		loginbtn.click();
	}
}