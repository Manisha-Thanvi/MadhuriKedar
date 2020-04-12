package testng;

import org.testng.annotations.Test;

public class p1 {
	@Test(priority=1,invocationCount=3)
	public void banana(){
System.out.println("from banana");

	}
	@Test(priority=2,invocationCount=3)
	public void apple(){
		System.out.println("from apple");
	}
	@Test(priority=3)
	public void cat(){
		System.out.println("from cat");
	}
	
}
