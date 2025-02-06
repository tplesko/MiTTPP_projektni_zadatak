package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;

public class AccountsOverviewPage {
    private WebDriver driver;

    private By accountsOverviewHeader = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    private By logoutLink = By.xpath("//*[@id='leftPanel']/ul/li[8]/a");

    public AccountsOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAccountsOverviewHeaderText() {
        return driver.findElement(accountsOverviewHeader).getText();
    }

    public boolean isUserLoggedIn() {
        try {
            return driver.findElement(logoutLink).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
