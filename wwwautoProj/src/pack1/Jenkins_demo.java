package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins_demo {

	
	@Test
	public void testgooglrsearch() {
		
	String expectTitle = "Selenium - Google Search";	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("http://google.in");
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("q")).submit();
	
	//it will fetch the actual title	
	String actualTitle = driver.getTitle();
	System.out.println("Before Assetion : " + " "+  expectTitle);
	
	//it will compare actual title and expected title
	Assert.assertEquals(actualTitle, expectTitle);
		System.out.println("After Assertion : " + " "+actualTitle + " -->Successful -- Title matched ");
	
	driver.quit();
	
	 }
	
	}