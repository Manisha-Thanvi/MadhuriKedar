package selenium;

import java.awt.AWTException;
import java.awt.Robot;

public class Robot3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r=new Robot();
		System.out.println("try to forcefully stop the program beforecount becomes 50");
		for(int i=0;i<50;i++){
			System.out.println(i);
			r.mouseMove(i+10, 200);
			Thread.sleep(1000);
			
		}

		
	}

}
