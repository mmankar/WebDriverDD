package remoteRepoGITJNKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 
{
	public static WebDriver driver;
@BeforeSuite
public void setUP()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
@Test
public void doLogin()
{
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("nilmangesh");
	//SoftAssert softassert=new SoftAssert();
	//softassert.assertAll();
	
}
@AfterSuite
public void tearDown() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
	}
}
