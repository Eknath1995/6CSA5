package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_Locator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("text"));
		driver.findElement(By.id("scroll-container"));
		driver.findElement(By.id("ticker"));
		driver.findElement(By.id("ticker"));
		driver.findElement(By.id("ticker"));
		driver.findElement(By.id("start"));
		driver.findElement(By.id("interstitial"));
		driver.findElement(By.id("back-button"));
		driver.findElement(By.id("skip-navigation"));
		driver.findElement(By.id("back-button-tooltip"));
		
		System.out.println("id identified");
		
		driver.close();
	}
}
