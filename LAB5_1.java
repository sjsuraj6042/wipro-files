package Aug13;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB5_1 {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php?");		
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"email_create\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("abcdefggg@gmail.com");
	//setting value by sendKey
	
	driver.findElement(By.id("SubmitCreate")).click();
	
	
	Thread.sleep(3000);
	driver.findElement(By.id("id_gender2")).isSelected();
	driver.findElement(By.id("id_gender2")).click();
	//gender selecting and clicking
	
	driver.findElement(By.id("id_gender2")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("customer_firstname")).sendKeys("Kavana");
	
	driver.findElement(By.id("customer_firstname")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("customer_lastname")).sendKeys("S P");
	
	driver.findElement(By.id("customer_lastname")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("email")).sendKeys(Keys.TAB);//password jump
	
	driver.findElement(By.id("passwd")).sendKeys("abc123");
	
	driver.findElement(By.id("passwd")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("days")).click();
	
	driver.findElement(By.id("days")).sendKeys("18");
	
	driver.findElement(By.id("days")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("months")).click();
	
	driver.findElement(By.id("months")).sendKeys("June");
	
	driver.findElement(By.id("months")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("years")).click();
	
	driver.findElement(By.id("years")).sendKeys("2025");
	
	driver.findElement(By.id("newsletter")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("newsletter")).click();
	
	driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	
}

}

