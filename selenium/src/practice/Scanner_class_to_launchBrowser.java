package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scanner_class_to_launchBrowser {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1 for ChromeBrowser and 2 for edge Browser");
		int n=sc.nextInt();
		
		
		if(n==1) {
			System.out.println("open ChromeBrowser");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.fb.com");
		}
		else if(n==2) {
			System.out.println("open edge browser");
			WebDriver driver=new EdgeDriver();
			driver.get("https://demo.actitime.com/login.do");
	}
		else
			return;
		
}}
