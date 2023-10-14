package com.myframework.driver;

import com.myframework.config.Config;
import com.myframework.config.ConstantReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.time.Duration;

public class Driver {


    public static void initializeDriver() throws MalformedURLException {

        Config config = ConstantReader.configReader(Config.class);
        String browser = config.browser();
        WebDriver driver = DriverFactory.getDriver(browser, config);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(config.timeout()));
        DriverManager.getDriver().get(config.url());
        System.out.println(DriverManager.getDriver().getTitle());
    }

    public static void tearDownDriver() {
        if (DriverManager.getDriver() != null)
            DriverManager.getDriver().quit();
    }
}
