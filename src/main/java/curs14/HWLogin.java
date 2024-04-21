package curs14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class HWLogin extends BaseTest {
    
    @Test(priority=0)
    public void loginTest() {
      
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/div/div[3]/ul/li/a"));
        loginButton.isDisplayed();

        WebElement emailInput = driver.findElement(By.id("log"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        
        Assert.assertFalse(emailInput.isDisplayed(), "Email input is not displayed");
        Assert.assertFalse(passwordInput.isDisplayed(), "Password input is not displayed");
        
        loginButton.click();

        //assertTrue(emailInput.isDisplayed(), "Email input is displayed after clicking login button");
        //assertTrue(passwordInput.isDisplayed(), "Password input is displayed after clicking login button");

        emailInput.sendKeys("test@example.com");
        passwordInput.sendKeys("test123");

    }
}


