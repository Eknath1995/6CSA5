package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {
	 public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.findElement(By.name("twitter:site"));
		driver.findElement(By.name("twitter:domain"));
		driver.findElement(By.name("twitter:app:name:iphone"));
		driver.findElement(By.name("twitter:app:id:iphone"));
		driver.findElement(By.name("twitter:app:name:googleplay"));
		driver.findElement(By.name("keywords"));
		driver.findElement(By.name("news_keywords"));
		driver.findElement(By.name("msapplication-config"));
		driver.findElement(By.name("google_ads_iframe_/1024780/Desktop_new/LB/Home_0"));
		driver.findElement(By.name("form"));
		
		System.out.println("Name identified");
		driver.close();
		
	}
}
