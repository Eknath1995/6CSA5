package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.findElement(By.id("pass"));
		System.out.println("element identified");
	}
}
