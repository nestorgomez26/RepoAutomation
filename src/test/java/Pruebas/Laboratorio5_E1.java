package Pruebas;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import paginas.paginaLogin;

import org.testng.TestNG;

public class Laboratorio5_E1 {
	
	
		WebDriver driver;
		paginaLogin login;
		
		String URL = "http://www.automationpractice.pl/index.php?controller=authentication";
		String PATH = "..\\EduIT\\Drivers\\chromedriver.exe";
		
		
		@BeforeSuite
		public void setUP(){
			
			System.setProperty("webdriver.chrome.driver", PATH);
			driver= new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();

	}	

		@AfterSuite
		public void cierraNavegador(){
			driver.close();

	}

		@Test(dataProvider="Datos Login") 
		public void irRegistroLogin(String email, String password){
			login= new paginaLogin (driver);
			login.IngresarDatos("email", "password");
			Assert.assertEquals(login.getTextTitleForm(), "AUTHENTICATION");
			
		}
		@DataProvider(name="Datos Login")
		public Object [][] getData(){
			
			Object [][]data=new Object[3][2];
			data[0][0]="test1@gmail.com"; data[0][1]="12340";
			data[1][0]="test2@gmail.com"; data[1][1]="14340";
			data[2][0]="test3@gmail.com"; data[2][1]="16340";
			
			return data;
		}
			
		
}

