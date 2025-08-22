package Aug13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_seleniumjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("the title is "+title);
		//WebElement username=driver.findElement(By.name("username"));
		//username.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		driver.findElement(By.xpath("//button[@type='submit')")).click();
		
		
	}

}
