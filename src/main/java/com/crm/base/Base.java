package com.crm.base;

import com.crm.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static Properties prop;
    public Base() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/sandeepkumar/IdeaProjects/untitled6/src/" +
                    "main/java/com/crm/config/config.properties");
            prop.load(ip);
        } catch (Exception ex) {
        }
    }

    public  static void Initialisation()
    {
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "/Users/sandeepkumar/Documents/" +
                    "Selenium_Web_Automation/selenium_webdriver/chromedriver");
            driver = new ChromeDriver();
        }
        else
        {
            System.setProperty("webdriver.gecko.driver", "/Users/sandeepkumar/Documents/" +
                    "Selenium_Web_Automation/selenium_webdriver/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEPUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }
}
