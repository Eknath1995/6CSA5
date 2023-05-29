package WebDrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_tilte {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://fb.com");
		String expected_title="Facebook – log in or sign up";
	String actual_title=driver.getTitle();
	
	  if(actual_title.equals(expected_title))
		  System.out.println("pass");
	  else
		  System.out.println("fail");
		
	}
}
