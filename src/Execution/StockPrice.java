package Execution;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StockPrice {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaahu\\Downloads\\Selenium\\chromedriver.exe");		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://finance.yahoo.com//");
		
	
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div/div/div/div[1]/div/div[2]/div/form/input[1]"));
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String x = "TSLA";
		
		element.sendKeys(x);
        element.submit();
        
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        WebElement stockpriceText = driver.findElement(By.xpath("//div[@id='quote-header-info']/div[@class='My(6px) Pos(r) smartphone_Mt(6px)']/div/div/span[1]"));
        System.out.println("The Stock price of TSLA is "+ stockpriceText.getText());    
        
        //Reading excel file, print it on the console
        
       // XSSFWorkbook workbook = new XSSFWorkbook();
		
		//XSSFSheet sheet = workbook.createSheet("Testing");
        
	}

}
