package curs15;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class ContactForm extends BaseTest {
	
	@Test
	public void contactForm() throws InterruptedException {
		
        JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
//		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
//		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red;')", loginMenu);
//		
//		WebElement logoSlogan = driver.findElement(By.cssSelector("div[class='logo_slogan']"));
//		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red;')", logoSlogan);
        
    //  a[href='the-long-road-to-the-deep-silence']
        
        jse.executeScript("window.scrollBy(0,500)");
		
		WebElement nameField = driver.findElement(By.cssSelector("input[name='your-name']"));
		nameField.sendKeys("John Doe");
		
		WebElement emailField = driver.findElement(By.cssSelector("input[name='your-email']"));
		emailField.sendKeys("andrei.urs88@gmail.com");
		
		WebElement subjectField = driver.findElement(By.cssSelector("input[name='your-s']"));
		subjectField.sendKeys("Test subject");
		
		WebElement messageField = driver.findElement(By.cssSelector("textarea[name='your-message']"));
		messageField.sendKeys("Qwuertyuiop123%#@#$");
		
		WebElement sendMessageBttn = driver.findElement(By.cssSelector("input[value='Send Message']"));
		sendMessageBttn.click();
		
		Thread.sleep(2000);
		
		WebElement confirmationMessage = driver.findElement(By.cssSelector("div.wpcf7-response-output"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red;')", confirmationMessage);
		assertTrue(confirmationMessage.isDisplayed());
		
		
		
	}

}
