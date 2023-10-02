package com.myframework.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.myframework.utils.ScreenShotUtils;

public final class ExtentLogger {
    private ExtentLogger() {
    }

    public static void pass(String message) {
        ExtentManager.getTest().pass(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String
                        (ScreenShotUtils.takeScreenShots()).build());
    }

    public static void fail(String message) {
        ExtentManager.getTest().fail(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String
                        (ScreenShotUtils.takeScreenShots()).build());
    }

    public static void info(String message) {
        ExtentManager.getTest().info(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String
                        (ScreenShotUtils.takeScreenShots()).build());
    }


}
