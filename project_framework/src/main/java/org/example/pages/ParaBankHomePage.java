package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class ParaBankHomePage {
    private WebDriver driver;

    private By usernameField =  By.name("username");
    private By passwordField =  By.name("password");
    private By loginButton = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
    private By registerLink = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");

    private By loginErrorLabel = By.xpath("//*[@id=\"rightPanel\"]/p");

    public ParaBankHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoToHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    public boolean isLoginFormDisplayed() {
        return driver.findElement(usernameField).isDisplayed() && driver.findElement(passwordField).isDisplayed() && driver.findElement(loginButton).isDisplayed();
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void goToRegisterPage() {
        driver.findElement(registerLink).click();
    }

    public String loginError() {
        return driver.findElement(loginErrorLabel).getText();
    }

}