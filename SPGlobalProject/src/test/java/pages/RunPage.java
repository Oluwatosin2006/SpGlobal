package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RunPage {
	
public WebDriver driver;
	
	By  runButton =By.id("run-button");
	By  outputWindowText = By.xpath("//span[@class='cm-string']");
	
	
	public RunPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	 public void clickRunBotton() {
		  
		 driver.findElement(runButton).click();
		
	 }
	 
	 public boolean checkOutputWindowTextIsDisplayed() {
		
		return driver.findElement(outputWindowText).isDisplayed();
	 }

}
