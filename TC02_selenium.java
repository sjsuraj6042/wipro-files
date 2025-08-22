package Aug13;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search =driver.findElement(By.id("APjFqb"));
		System.out.println("title:"+driver.getTitle());
		search.sendKeys("Automation Testing Tools");
		search.sendKeys(Keys.ENTER);
		//search.submit();
		driver.findElement(By.name("btnK")).click();
		
	}

}
