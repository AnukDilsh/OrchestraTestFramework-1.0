//[Documentation] A test suit for Qmatic Orchestra
//[Author] Anuk Dilshan

package com.orchestra.pageObjects;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

    WebDriver ldriver;


    //Creating the Constructor
    public LoginPage(WebDriver rdriver){

        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);

    }

    //By UserName = By.name("username");

    @FindBy(name = "username")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(name = "password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "/html/body/main/div/div[2]/form/button")
    @CacheLookup
    WebElement btnLogin;

/*
    public void testUsername(String usrname){
        ldriver.findElement(UserName).sendKeys(usrname);
    }
*/

    public void setUsername(String uname){
        txtUsername.sendKeys(uname);

    }

    public void setPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();

    }

}
