package com.myframework.driver;

import com.myframework.config.Config;
import com.myframework.config.ConstantReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    public static WebDriver getDriver(String browser, Config config) throws MalformedURLException {
        WebDriver driver = null;
        if (config.run_mode().equals("local")) {
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
        } else if (config.run_mode().equals("remote")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            switch (browser) {
                case "chrome":
                    capabilities.setBrowserName("chrome");
                case "firefox":
                    break;
                case "edge":
                    break;
                default:
                    capabilities.setBrowserName("chrome");
            }
            driver = new RemoteWebDriver(new URL(config.remote_url()), capabilities);

        }
        return driver;
    }
}
