package seleniumutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();//inchide toate taburile
		//driver.close();//inchide tabul curent
	}

}
