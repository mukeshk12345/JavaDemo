package com.greens.utils;

	
	


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public	static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}

	public void openApp(String url) {
		driver.get(url);
		}
	
	public void maxi() {
		driver.manage().window().maximize();
	}
	
	public  void iwait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void send(WebElement element,String value) {
		element.sendKeys(value);
		}
	
	public void tap(WebElement element) {
		element.click();
	}
//	public void screenShot(String path) {
//	
//		try {
//			TakesScreenshot tk=(TakesScreenshot)driver;
//			File src=tk.getScreenshotAs(OutputType.FILE);
//			File dest=new File(path);
//			FileHandler.copy(src ,dest);
//			
//			
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}	
//	}
	}

	
	
	


