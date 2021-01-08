package com.qa.SpiceJet.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"D:\\Sujeet_PC\\S_jet\\src\\main\\java\\com\\qa\\SpiceJet\\Config\\config.Properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void init() {
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		driver.get(prop.getProperty("url"));

	}

}
