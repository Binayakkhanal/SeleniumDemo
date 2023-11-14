package review;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\review\\src\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		String expectedResult = "JPetStore Demo";
		String actualResult =  driver.getTitle();
		System.out.println(actualResult);
		if (expectedResult.equals(actualResult)) {
			System.out.println(actualResult);
			System.out.println("1.Test Pass");
		}
		else {
			System.out.println("1.Test Fail");
		}
		driver.findElement(By.linkText("Enter the Store")).click();
		//driver.findElement(By.cssSelector("#MenuContent > a:nth-child(3)")).click();
		//driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]")).click();
		
		takeScreenshot scrShot = new takeScreenshot();
		scrShot.takeSnapShot(driver, "C:\\Users\\Acer\\eclipse-workspace\\review\\src\\Screenshot\\test.jpg");
		
//		String expectedResult1 = "Sign In";
//		String actualResult1 = driver.findElement(By.linkText("Sign In")).getText();
//		if (expectedResult1.equals(actualResult1)) {
//			System.out.println(actualResult1);
//			System.out.println("2.Test Pass");
//		}
//		else {
//			System.out.println("2.Test Fail");
//		}
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		
//		driver.findElement(By.name("username")).sendKeys("Bin");
		
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		String uname = "Binayak" + rand_int1 ;
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("repeatedPassword")).sendKeys("123456");
		
		for (int i=0; i<=9; i++) {
		String a[] = { "Binayak", "Khanal", "binakha@gmail.com", "9876765547", "ktm", "bhk", "ktm", "bag", "1010", "Nepal" };
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr["+(i+1)+"]/td[2]/input")).sendKeys(a[i]);
		}
		
		Select drpLanguage = new Select(driver.findElement(By.name("account.languagePreference")));
		drpLanguage.selectByVisibleText("japanese");
		
		Select drpFav = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		drpFav.selectByVisibleText("DOGS");
		
		
		
		driver.findElement(By.name("newAccount")).click();

	/*	driver.findElement(By.name("username")).sendKeys("12345678910");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("12345678910");
		driver.findElement(By.name("signon")).click();
		String expectedResult2 = "Welcome Binayak!";
		String actualResult2 = driver.findElement(By.id("WelcomeContent")).getText();
		
		if (expectedResult2.equals(actualResult2)) {
		System.out.println(actualResult2);
		System.out.println("3.Test Pass");
		}
		else {
			System.out.println("3.Test Fail");
		}
		driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("fish");
		driver.findElement(By.name("searchProducts")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a")).click(); */
		
		
		//driver.close();  
		
	}

} 
