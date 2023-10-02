package com.myframework.pages;

import com.google.common.truth.Truth;
import com.myframework.driver.DriverManager;
import com.myframework.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.myframework.utils.SeleniumUtils.*;

public class LoginPage {

    private static final By TEXT_BOX_USER_NAME = By.cssSelector("#user-name");
    private static final By TEXT_BOX_PASSWORD = By.cssSelector("#password");
    private static final By BUTTON_LOGIN = By.cssSelector("#login-button");
    private static final By TEXT_ERROR = By.cssSelector("h3[data-test='error']");

    public HomePage userLogsIn(String userName, String Password) {

        sendKeys(TEXT_BOX_USER_NAME,userName);
        sendKeys(TEXT_BOX_PASSWORD,Password);
        click(BUTTON_LOGIN);

        return new HomePage();
    }

    public void verifyErrorMessageForLockedOutUser() {
        String myActualError=getText(TEXT_ERROR);
        Truth.assertThat(myActualError).isEqualTo("Epic sadface: Sorry, this user has been locked out.");
    }
}
