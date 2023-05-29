package WebDrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle{
	public static void main(String[] args) {
		WebDriver driver=  new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String title= driver.getTitle();
		
		System.out.println(title);				// 1st way
		System.out.println(driver.getTitle());	// 2nd way
	}
}
