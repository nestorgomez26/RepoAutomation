package paginas;


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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class paginaLogin {

	@FindBy(id="email")
	WebElement txtEmail;
	
	@FindBy(id="passwd")
	WebElement txtPassWord;
	
	@FindBy(id="SubmitLogin")
	WebElement btnLogin;
	
	@FindBy(xpath="//h1[contains(text(),'Authentication')]")
	WebElement titleForm;
	
	public paginaLogin(WebDriver driver) {
		
		PageFactory.initElements(new AjaxElementLocatorFactory (driver,20),this);
	}
	
	public void IngresarDatos(String email,String password) {
		
		txtEmail.sendKeys(email);
		txtPassWord.sendKeys(password);
		btnLogin.click();
		
	}
		
	public String getTextTitleForm() {
		
		return titleForm.getText();
		
	}
		
	}
	
	
	
	




