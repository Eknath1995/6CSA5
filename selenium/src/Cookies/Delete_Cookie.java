package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Delete_Cookie {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		Set<Cookie> Allcookies = driver.manage().getCookies();
		System.out.println(Allcookies.size());
		
		for (Cookie C : Allcookies) 
			System.out.println(C.getName());
			
		Cookie cooki=new Cookie("abc", "123");
		driver.manage().addCookie(cooki);
		

		
		Allcookies = driver.manage().getCookies();
		System.out.println(Allcookies.size());
		
		for (Cookie C : Allcookies) 
			System.out.println(C.getName());
		
		driver.manage().deleteCookie(cooki);
		

		Allcookies = driver.manage().getCookies();
		System.out.println(Allcookies.size());
		
		for (Cookie C : Allcookies) 
			System.out.println(C.getName());
		

	}
	}

