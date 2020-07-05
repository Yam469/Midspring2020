package locators;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Variouslocators {
	WebDriver driver;

	@Before
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public void interactwithWebElement() throws InterruptedException {
		// name locator
		driver.findElement(By.name("firstname")).sendKeys("abcd");
		driver.findElement(By.name("lastname")).sendKeys("pqr");
		// ID locator
		driver.findElement(By.id("sex-1")).click();
		// Class locator--Error
		//driver.findElement(By.className("input-file")).click();
		// Link text
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//Partial link Text
		//driver.findElement(By.partialLinkText("TF-API ")).click();
		//driver.findElement(By.cssSelector("input#exp-2")).click();
		//driver.findElement(By.cssSelector("input.input-file")).click();
		driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
		Thread.sleep(5000);
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"photo\"]"));
		
		upload.sendKeys("C:\\Users\\14694\\Downloads\\2020-06-22--Session 2.pptx");
		//driver.findElement(By.cssSelector("input[value='Manual Tester']")).click();
		//xpath locator
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("i love selenium");
		//driver.findElement(By.xpath("driver.findElement(By.xpath(\"//input[@name='lastname']")).sendKeys("i love selenium");
		
		
		Thread.sleep(5000);
		driver.close();
	}
}
