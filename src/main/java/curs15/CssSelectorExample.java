package curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import seleniumutils.BaseTest;

public class CssSelectorExample extends BaseTest {
	
	@Test
	public void cssExample1() {
		
		
		//  <h2 class="sc_title sc_title_underline sc_align_center margin_bottom_tiny" style="margin-top: 1.15em;text-align:center;">
		//  .sc_title_underline
		//  h2[class='sc_title sc_title_underline sc_align_center margin_bottom_tiny']
		
		//  CssSelector pentru atribut class --> .
		//  .menu_main_nav_area
		//  nav[class='menu_main_nav_area']
		//  tag  atr         val
		
		//  CssSelector pentru atribut id --> #
		//  $menu_user --> gaseste orice element care are id (#) cu valoarea 'menu_user'
		//  ul$menu_user --> gaseste doar elementele care au tagname 'ul' si id (#) cu valoarea 'menu_user'
		//  ul[id='menu_user'
		//  ul --> tagname
		//  id (#) --> atribut
		//  menu_user --> valoarea atribut
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red;')", loginMenu);
		
		WebElement logoSlogan = driver.findElement(By.cssSelector("div[class='logo_slogan']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red;')", logoSlogan);
	}
	
	
	@Test
	public void cssExample2() {
		
		WebElement loginPopup = driver.findElement(By.cssSelector("a[href='#popup_login']"));
		loginPopup.click();
		
		//input#log
		//input[id='log']
		//input[id='log'] [name='log'] [placeholder='Login or Email']
		
		
		//logical AND
		WebElement usernameField = driver.findElement(By.cssSelector("input[id='log'][name='log'][placeholder='Login or Email']"));
		usernameField.sendKeys("Test User");
		
		
	    //logical OR
		WebElement passwordField = driver.findElement(By.cssSelector("input[id='password'],[name='pwd']"));
		passwordField.sendKeys("parola");
	}
	
	@Test
	public void cssExample3() {
		
		//  * --> contains
		//ex:
		//  a[href='the-long-road-to-the-deep-silence']
		//  a[href*='road']
		WebElement book1 = driver.findElement(By.cssSelector("a[href*='road-to']"));
		System.out.println(book1.getText());
		
		WebElement book2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		System.out.println(book2.getText());
		
		WebElement book3 = driver.findElement(By.cssSelector("a[href^='life']"));
		System.out.println(book3.getText());
		
		WebElement book4 = driver.findElement(By.cssSelector("a[href$='story']"));
		System.out.println(book4.getText());
		
		
		
	}
	
	

	
}


















