package com.myframework.driver;

import com.myframework.config.Config;
import com.myframework.config.ConstantReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {

    public static WebDriver getDriver(String browser,Config config)
    {
        WebDriver driver = null;
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("disable-infobars");
                chromeOptions.addArguments("--disable-notifications");
                chromeOptions.addArguments("start-maximized");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                break;
            case "edge":
                break;
            default:
                driver = new ChromeDriver();
        }
        return driver;
    }
}
