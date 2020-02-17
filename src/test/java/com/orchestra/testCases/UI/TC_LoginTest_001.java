//[Documentation] A test suit for Qmatic Orchestra
//[Author] Anuk Dilshan

package com.orchestra.testCases.UI;

import com.orchestra.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws IOException {

        driver.get(baseURL);
        logger.info("Now the URL is opened.");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage lp = new LoginPage(driver);
        lp.setUsername(userName);
        logger.info("Entered the Username.");

        lp.setPassword(password);
        logger.info("Entered the password.");

        lp.clickLogin();
        logger.info("Clicked on the Login button.");

        if(driver.getTitle().equals("Qmatic Platform")){
            Assert.assertTrue(true);
            logger.info("User has logged-in successfully.");

        }
        else
        {
            captureScreen(driver,"loginTest");
            Assert.assertTrue(false);
            logger.info("User CANNOT logged-in successfully.");

        }
    }
}
