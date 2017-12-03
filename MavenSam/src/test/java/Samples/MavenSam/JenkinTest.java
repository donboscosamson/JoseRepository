package Samples.MavenSam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinTest {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.chase.com");
	    driver.findElement(By.xpath("//a[text()='ATM & branch']")).click();
	    String str=driver.findElement(By.xpath("//a[text()='ATM & branch']")).getText();
		Assert.assertEquals("ATM & branch",str);
		System.out.println("ATM Branch Clicked");

	}
	

	
	

}
