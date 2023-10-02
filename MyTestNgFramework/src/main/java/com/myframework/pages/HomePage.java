package com.myframework.pages;

import com.google.common.truth.Truth;
import com.myframework.driver.DriverManager;
import com.myframework.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.myframework.utils.SeleniumUtils.getText;

public class HomePage {
    private static final By TEXT_APP_LOGO = By.cssSelector(".app_logo");

    public void verifyUserIsLoggedIn(String expectedHeader) throws InterruptedException {
        String myHeader = getText(TEXT_APP_LOGO);
        Truth.assertWithMessage("Login failed").that(myHeader).isEqualTo(expectedHeader);
    }
}
