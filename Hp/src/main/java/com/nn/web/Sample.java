package com.nn.web;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.SystemProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		String property = System.getProperty("webdriver.chrome.driver");
//		WebDriverManager.firefoxdriver().setup();
//		String property = System.getProperty("webdriver.gecko.driver");

		System.out.println(property);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.novalnet-solutions.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// Set<WebElement> allLinks = (Set<WebElement>)
		// driver.findElements(By.tagName("a"));
		LinkedHashSet<WebElement> now = new LinkedHashSet<WebElement>(driver.findElements(By.tagName("a")));
		// Traversing through the list and printing its text along with link address
		for (WebElement link : now) {

			String nnlinks = link.getAttribute("href");

			System.out.println(nnlinks);

		}

		driver.close();
		driver.quit();

	}

}
