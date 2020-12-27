package Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaahu\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement create = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		create.click();
		
		Thread.sleep(2000); //added wait time 2 secs
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		Thread.sleep(100);
		firstname.sendKeys("Abdul");
		
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		Thread.sleep(100);
		lastname.sendKeys("Aziz");
	
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		Thread.sleep(100);
		String x = "abdulaziz123akhtar@gmail.com";
		email.sendKeys(x);
		
		Thread.sleep(10000);
		
		WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
		Thread.sleep(100);
		reemail.sendKeys(x);
		
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		Thread.sleep(100);
		String y = "Welcome12345";
		pass.sendKeys(y);
		
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement month = driver.findElement(By.xpath("//option[contains(text(),'Jul')]"));
		Thread.sleep(100);
		month.click();
		
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement date = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[2]/option[3]"));
		Thread.sleep(100);
		date.click();
		
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement year = driver.findElement(By.xpath("//option[contains(text(),'1997')]"));
		Thread.sleep(100);
		year.click();
		
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement gender = driver.findElement(By.name("sex"));
		Thread.sleep(100);
		gender.click();
		
		Thread.sleep(2000);//added wait time 2 secs
		
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
	}
//Can we create a google account through automation, and how do you make sure that the email and password meets the requirements
}
