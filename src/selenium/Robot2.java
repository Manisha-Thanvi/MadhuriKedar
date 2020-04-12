package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot2 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(2000);
		Robot r2=new Robot();
		
		r2.keyPress(KeyEvent.VK_SHIFT);
		r2.keyPress(KeyEvent.VK_Q);
		r2.keyPress(KeyEvent.VK_SHIFT);
		r2.keyPress(KeyEvent.VK_S);
		r2.keyPress(KeyEvent.VK_P);
		
		
		
		
		
		
		
		

	}

}
