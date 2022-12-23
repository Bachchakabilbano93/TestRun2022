package com.prac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Masters%20Program/Course%202/pages/Checkbox1.html");
		
		WebElement ch1 = driver.findElement(By.id("One"));
//		WebElement ch1 = driver.findElement(By.xpath("/html/body/label[1]/span"));
//		WebElement ch2 = driver.findElement(By.id("Two"));
		WebElement ch2 = driver.findElement(By.xpath("/html/body/label[2]/span"));
		
//		System.out.println(ch1.isSelected());
//		Thread.sleep(3000);
//		ch1.click();
//		System.out.println(ch1.isSelected());
		
		System.out.println(ch2.isSelected());
		ch2.click();
		Thread.sleep(3000);
		System.out.println(ch2.isSelected());
	}

}
