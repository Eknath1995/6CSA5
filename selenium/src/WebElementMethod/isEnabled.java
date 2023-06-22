package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		username.clear();
		password.clear();
		username.sendKeys("EKNATHCHINNA");
		password.sendKeys("67843265");
		WebElement login = driver.findElement(By.name("login"));
		System.out.println(login.isEnabled());
		driver.close();
	}

}
