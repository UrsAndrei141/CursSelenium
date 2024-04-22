package curs15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class FindElementsExample extends BaseTest {
	
	@Test
	public void FindElementsTest() {
		
        JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		
		//figure[class*='sc_image_shape_square']
		
		List<WebElement> bookPicture = driver.findElements(By.cssSelector("figure[class*='sc_image_shape_square']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red;')", bookPicture.get(1));
	}

}
