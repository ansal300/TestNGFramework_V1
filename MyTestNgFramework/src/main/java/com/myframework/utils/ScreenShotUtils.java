package com.myframework.utils;

import com.myframework.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class ScreenShotUtils {

    private ScreenShotUtils()
    {

    }

    public static String takeScreenShots()
    {
       return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}

