package review;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class al {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
	//	System.setProperty("webdriver.chrome.drive", "C:\\\\Users\\\\Acer\\\\eclipse-workspace\\\\review\\\\src\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		alert.accept();
	}

}
