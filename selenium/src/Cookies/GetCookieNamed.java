package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//getting single cookie by its name
public class GetCookieNamed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Cookie cooky = driver.manage().getCookieNamed("sb");
		System.out.println(cooky);
	}
}
