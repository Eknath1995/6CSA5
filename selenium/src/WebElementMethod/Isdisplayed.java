package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.id("email"));
		System.out.println( username.isDisplayed());
		driver.close();
	}
}
