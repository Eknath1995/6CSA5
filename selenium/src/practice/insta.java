package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		System.out.println(driver.getTitle());
	}
}
