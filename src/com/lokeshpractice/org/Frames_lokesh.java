package com.lokeshpractice.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_lokesh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user pc\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		

	}

}
