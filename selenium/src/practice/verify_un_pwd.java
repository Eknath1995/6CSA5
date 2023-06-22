package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_un_pwd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("pass"));
        
		WebElement login = driver.findElement(By.name("login"));

		if(username.isDisplayed() && username.isEnabled())
			username.sendKeys("Admin");
		else
			System.out.println("elements are not present");

		if(password.isDisplayed() && password.isEnabled())
			password.sendKeys("admin123");
		else
			System.out.println("elements are not present");

		if(login.isDisplayed() && login.isEnabled())
			login.click();
		else
			System.out.println("submit button not present");

	}
}

