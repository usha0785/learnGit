package firstTestNgpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNgFile {

	WebDriver driver;
	
	public String basicUrl="http://demo.guru99.com/test/newtours/";
	 
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		System.out.println("Before Test executed");
	}
	
	
  @Test
  public void verifyHomePageTitle() {
	  System.out.println("verifyHomePageTitle executed");
	  driver.get(basicUrl);
	  String expectedTitle="Welcome: Mercury Tours";
	  String currentTitle=driver.getTitle();
	  Assert.assertEquals(currentTitle, expectedTitle);
	  
  }
  
  
  
  @AfterTest
  public void terminateBrowser() {
	  System.out.println("terminateBrowser executed");  
	  driver.close();
  }
  
  @Test
  public void test2() {
	  System.out.println("test2 executed"); 
  }
  
    
}
