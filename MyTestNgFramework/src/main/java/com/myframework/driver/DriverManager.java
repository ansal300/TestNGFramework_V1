package com.myframework.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static ThreadLocal<WebDriver> webDriver=new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        return webDriver.get();
    }

    public static void setDriver(WebDriver driver)
    {
        webDriver.set(driver);
    }
}
