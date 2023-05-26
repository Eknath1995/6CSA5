package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapchat {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.snapchat.com/accounts/v2/login");
		System.out.println(driver.getTitle());
	}
	}

