package com.myframework.utils;

import com.myframework.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    public static void click(By by)
    {
        WebElement element=waitUntilElementIsPresent(by);
        element.click();
    }

    public static void sendKeys(By by,String text)
    {
        WebElement element=waitUntilElementIsPresent(by);
        element.sendKeys(text);
    }

    public static String getText(By by)
    {
        WebElement element=waitUntilElementIsPresent(by);
        String text=element.getText();
        return text;
    }

    private static WebElement waitUntilElementIsPresent(By by)
    {
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(30));
        WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }
}
