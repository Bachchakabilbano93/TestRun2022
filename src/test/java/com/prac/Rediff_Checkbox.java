package com.prac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement ch1 = driver.findElement(By.id("remember"));
		
		System.out.println(ch1.isSelected());
		
		Thread.sleep(1000);
		ch1.click();
		System.out.println(ch1.isSelected());

	}

}
