package testcases;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automation.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("allow")).click();
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for (WebElement link : allLinks) {
			
			System.out.println(link.getText()+ "-" + link.getAttribute("href"));
			
		}
			
			
			
		
		}
			
		
		
		


}
