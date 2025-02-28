package EducacionIT.EduIT;

import java.time.Duration;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Laboratorio2 {
	
	@Test 
	public void Lab2(){
		
		String URL = "http://www.automationpractice.pl/index.php?controller=authentication";
		String PATH = "..\\EduIT\\Drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", PATH);
		WebDriver driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();

		

	}	
}