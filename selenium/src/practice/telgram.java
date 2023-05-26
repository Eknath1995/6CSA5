package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class telgram {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.telegram.org/a/");
		System.out.println(driver.getTitle());
	}
	}

