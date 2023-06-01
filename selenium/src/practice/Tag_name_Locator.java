package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_name_Locator {
	 public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com");
		driver.findElement(By.tagName("script"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.tagName("nav"));
		driver.findElement(By.tagName("style"));
		driver.findElement(By.tagName("noscript"));
		driver.findElement(By.tagName("img"));
		driver.findElement(By.tagName("iframe"));
		
		System.out.println("tagName identified");
		driver.close();
		
		
	}
}
