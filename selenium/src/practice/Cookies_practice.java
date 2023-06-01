package practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_practice {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.fb.com");
		Set<Cookie> Allcookies = driver.manage().getCookies();
		System.out.println(Allcookies.size());
	for(Cookie cooki: Allcookies) {
			System.out.println(cooki.getName());
			Cookie cooky = new Cookie("selenium", "524");
			driver.manage().addCookie(cooky);
	
			 Allcookies = driver.manage().getCookies();
			 System.out.println(Allcookies.size());
			 for(Cookie cooki1: Allcookies) {
					System.out.println(cooki1.getName());
		
			 }}
	}}
