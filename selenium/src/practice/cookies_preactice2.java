package practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class cookies_preactice2 {
	 public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		Set<Cookie> Allcookies = driver.manage().getCookies();
	
		System.out.println(Allcookies.size());
		
		for (Cookie cookie : Allcookies) 
			System.out.println(cookie.getName());
			
		Cookie cooki1 = new Cookie("java", "1");
		Cookie cooki2 = new Cookie("manual","2");
		Cookie cooki3 = new Cookie("selenium","3");
		
		driver.manage().addCookie(cooki1);
		driver.manage().addCookie(cooki2);
		driver.manage().addCookie(cooki3);
	 
		 Allcookies = driver.manage().getCookies();
		System.out.println(Allcookies.size());
		for (Cookie cookie : Allcookies) 
			System.out.println(cookie.getName());
		
		driver.manage().deleteCookieNamed("selenium");
		
		 Allcookies = driver.manage().getCookies();
			System.out.println(Allcookies.size());
			for (Cookie cookie : Allcookies) 
				System.out.println(cookie.getName());
			
			driver.manage().deleteCookieNamed("java");
			
			Allcookies = driver.manage().getCookies();
			System.out.println(Allcookies.size());
			for (Cookie cookie : Allcookies) 
				System.out.println(cookie.getName());
			
			driver.manage().deleteCookieNamed("manual");
			
			Allcookies = driver.manage().getCookies();
			System.out.println(Allcookies.size());
			for (Cookie cookie : Allcookies) 
				System.out.println(cookie.getName());
			

			driver.manage().deleteCookieNamed("wd");
			
			Allcookies = driver.manage().getCookies();
			System.out.println(Allcookies.size());
			for (Cookie cookie : Allcookies) 
				System.out.println(cookie.getName());
			
			
			driver.manage().deleteAllCookies();
			
			Allcookies = driver.manage().getCookies();
			System.out.println(Allcookies.size());
	 }
}
