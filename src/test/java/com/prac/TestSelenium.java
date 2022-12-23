package com.prac;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class TestSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
//		ChromeDriver
//		Know the chrome browser version
//		Download the corresponding ChromeDriver exe version
//		Set the system path webdriver.chrome.driver
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
