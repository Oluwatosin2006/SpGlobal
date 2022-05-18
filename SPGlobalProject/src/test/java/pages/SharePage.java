package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SharePage {
	
public WebDriver driver;
    
	By  shareButton =By.xpath("//button[@id='Share']");
	By  checkTheLink= By.xpath("//input[@class='share-input share-link']");
	
	public SharePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	 public void clickShareBotton() {
		  
	    driver.findElement(shareButton).click();
		
	 }
	 
	 public boolean checkTheLinkStartWith() {
		
		return driver.findElement(checkTheLink).isDisplayed();
	 }


}
