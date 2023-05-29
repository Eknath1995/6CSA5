package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookieName {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		 Set<Cookie> Allcookies=driver.manage().getCookies();
		 
		 System.out.println(Allcookies.size());
		 
		 for(Cookie cooky:Allcookies)
		 System.out.println(cooky.getName());
//			 System.out.println(cooky.getExpiry());
	
	}

}
 