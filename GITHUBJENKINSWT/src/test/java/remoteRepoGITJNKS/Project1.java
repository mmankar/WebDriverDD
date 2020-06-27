package remoteRepoGITJNKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 
{
	public static WebDriver driver;
@BeforeMethod
public void setUP()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
@Test
public void doLogin()
{
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("logi1")).sendKeys("nilmangesh");
}
@AfterMethod
public void closeBrowser()
{
	driver.close();
	}
}
