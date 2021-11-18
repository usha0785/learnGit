package firstTestNgpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNgFile {
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	
	public String basicUrl="http://demo.guru99.com/test/newtours/";
	 
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		
	}
	
	
  @Test
  public void verifyHomePageTitle() {
	  driver.get(basicUrl);
	  String expectedTitle="Welcome: Mercury Tours";
	  String currentTitle=driver.getTitle();
	  Assert.assertEquals(currentTitle, expectedTitle);
	  
  }
  
    
}
