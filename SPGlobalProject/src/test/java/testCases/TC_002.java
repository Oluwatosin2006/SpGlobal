package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SharePage;

public class TC_002 extends BaseClass{
	
	@Test
	public void test2() {
		
	SharePage share = new SharePage(driver);
	share.clickShareBotton();
	Assert.assertTrue(share.checkTheLinkStartWith());
	
		
	
}

}
