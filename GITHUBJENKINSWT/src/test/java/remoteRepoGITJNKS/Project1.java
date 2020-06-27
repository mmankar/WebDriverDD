package remoteRepoGITJNKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

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
}
@AfterSuite
public void closeBrowser()
{
	driver.close();
	}
}
