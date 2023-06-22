package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADMIN/Desktop/task.html/HTML.html/Formtask.html");
		driver.findElement(By.id("NAME")).sendKeys("123");
	}
}
