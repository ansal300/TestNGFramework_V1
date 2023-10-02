package com.myframework.reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {
    public static ThreadLocal<ExtentTest> test=new ThreadLocal<>();

     static ExtentTest getTest()
    {
        return test.get();
    }

     static void setTest(ExtentTest testName)
    {
        test.set(testName);
    }
}
