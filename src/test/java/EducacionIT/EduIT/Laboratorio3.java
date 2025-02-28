package EducacionIT.EduIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Ignore;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.TestNG;




public class Laboratorio3 {
	
		WebDriver driver;
		String URL = "http://www.automationpractice.pl/index.php?controller=authentication";
		String PATH = "..\\EduIT\\Drivers\\chromedriver.exe";
		
		
		@BeforeSuite
		public void setUP(){
			
			System.setProperty("webdriver.chrome.driver", PATH);
			driver= new ChromeDriver();
	}	
		@BeforeTest 
		public void irURL(){
			driver.get(URL);
	}
		@BeforeClass
		public void maxVentana(){
			driver.manage().window().maximize();

	}
		@Test 
		public void registrarUsuario(){
			
			//1
			WebElement EmailAddress_button=driver.findElement(By.id("email_create"));
			EmailAddress_button.click();
			EmailAddress_button.sendKeys("correo"+Math.random()+"@gmail.com");

			//2
			WebElement CreateAccount_button=driver.findElement(By.id("SubmitCreate"));
			CreateAccount_button.click();
			
			
			//3
			WebDriverWait myWait = new WebDriverWait(driver,10);
			WebElement Gender_button = myWait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
			Gender_button.click();
			
			
			//4
			WebElement FirstName_button=driver.findElement(By.id("customer_firstname"));
			FirstName_button.click();
			FirstName_button.sendKeys("Nestor Jose");
			
			//5
			WebElement LastName_button=driver.findElement(By.id("customer_lastname"));
			LastName_button.click();
			LastName_button.sendKeys("Gomez Barrios");
		
			//6
			WebElement Pass_button=driver.findElement(By.id("passwd"));
			Pass_button.click();
			Pass_button.sendKeys("12345");
			
			//7
			Select Day_button = new Select(driver.findElement(By.id("days")));
			Day_button.selectByValue("26");
			
			//8
			Select Month_button = new Select(driver.findElement(By.id("months")));
			Month_button.selectByValue("8");
			
			//9
			Select Year_button = new Select(driver.findElement(By.id("years")));
			Year_button.selectByValue("1989");
			
			//10
			WebElement Register_button=driver.findElement(By.id("submitAccount"));
			Register_button.click();
			
			Assert.assertEquals("http://www.automationpractice.pl/index.php?controller=my-account", driver.getCurrentUrl());
	}
		@Test 
		public void pruebaTest(){
			
			//assertTrue(true);
	}
		
		@AfterMethod
		public void CapturaPAntalla() throws IOException {
			
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File ("..\\EduIT\\Evidencias2\\pantalla.png"));
			
		}
		
		@AfterClass
		public void finPrueba(){
			
			System.out.println("Fin de la prueba");
			
			}
		@AfterTest
		public void cierraNavegador(){
			
			driver.close();

	}
		@AfterSuite
		public void finSuite(){
			
			System.out.println("Fin Suite");
	}
		
		
		
}