package Aug13;

import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC004_findingelements {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links in amazon.in:"+alllinks.size());
		
		for(WebElement link :alllinks)
		{
			System.out.println("The link is:"+link.getAttribute("href"));
			System.out.println("The link is:"+link.getText());
		}
	}
 
}
 