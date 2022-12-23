package com.prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImages {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		String URL = "https://www.google.com/";
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();
//		driver.findElement(By.partialLinkText("Images")).click();
		driver.findElement(By.className("Gdd5U")).click();
		driver.findElement(By.className("DV7the")).click();
//not working		driver.findElement(By.partialLinkText("Upload an image")).click();
//not working		driver.findElement(By.name("encoded_image")).click();
		
		StringSelection selection = new StringSelection("C:\\tmp\\965C177E.PNG");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		
		
		
		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
//		C:\tmp\965C177E.PNG
		
		Thread.sleep(3000);
		
//		ctrl + v
//		press ctrl
//		press v
//		release v
//		release ctrl
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
//		Thread.sleep(10000);
//		
//		driver.close();
		
		
		
		
		

	}

}
