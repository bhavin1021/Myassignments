package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement findElement1 = driver.findElement(By.id("password"));
		findElement1.sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.close();		 
	}

}