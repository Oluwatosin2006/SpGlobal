package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 public String baseURL = "https://dotnetfiddle.net/";
	 public static WebDriver driver;
	    
	    @BeforeClass
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    	driver.get(baseURL);
	    	driver.manage().window().maximize();
	    	
	    	
	    }
	    
	    
	   @AfterClass
	   public void tearDown() {
		   driver.quit();
	   }

}
