package Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaahu\\\\Downloads\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com//");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("a.a.a.hustler@hotmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome@1380");
		pass.submit();
	}

}
