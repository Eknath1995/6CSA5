package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.fb.com");
	Cookie cooki=new Cookie("sele","50");
	
    System.out.println(driver.manage().deleteCookieNamed("sele"));
	
}}
