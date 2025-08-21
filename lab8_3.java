package Aug13;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.nio.channels.Selector;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class lab8_3 {
	static WebDriver driver;
    static WebDriverWait wait;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		   
		  WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		 driver.quit();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeTest
	public void setUp() throws Exception {
		  
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterTest
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("https://tutorialsninja.com/demo/index.php?");
		   driver.findElement(By.linkText("Desktops")).click();
	        driver.findElement(By.linkText("Mac (1)")).click();

	        WebElement sortele = driver.findElement(By.id("input-sort"));
	        Select sortSelect = new Select(sortele);
	        sortSelect.selectByIndex(1);

	        driver.findElement(By.xpath("//div[@class='button-group']//button")).click();

	      
	}

}

