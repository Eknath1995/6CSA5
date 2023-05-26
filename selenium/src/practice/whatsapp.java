package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatsapp {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.whatsapp.com/");
		System.out.println(driver.getTitle());
	}
	}

