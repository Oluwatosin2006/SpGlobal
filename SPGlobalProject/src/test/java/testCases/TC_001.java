package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RunPage;

public class TC_001 extends BaseClass{
	
	

	@Test
	public void test1() throws InterruptedException {
		
		
		RunPage run = new RunPage(driver);
		
		run.clickRunBotton();
		
		Assert.assertTrue(run.checkOutputWindowTextIsDisplayed());
		
		
		
		
		
	}

}
