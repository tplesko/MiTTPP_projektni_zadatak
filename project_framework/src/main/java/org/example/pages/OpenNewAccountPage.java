package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenNewAccountPage {
    private WebDriver driver;

    private By header = By.xpath("//h1[contains(text(),'Open New Account')]");

    private By openAccountButton = By.xpath("//input[@value='Open New Account']");

    private By accountTypeDropdown = By.xpath("//*[@id='type']");

    private By secondDropdown = By.xpath("//*[@id='fromAccountId']");

    private By successfulOpeningAccountLabel = By.xpath("//*[@id=\"openAccountResult\"]/p[1]");

    public OpenNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        return driver.findElement(header).getText();
    }

    public void selectAccountOptions() {
        Select accountTypeSelect = new Select(driver.findElement(accountTypeDropdown));
        accountTypeSelect.selectByValue("1"); //savings, 1 za checking

        Select secondDropdownSelect = new Select(driver.findElement(secondDropdown));
        secondDropdownSelect.selectByValue("12678");
    }

    public void openNewAccount() {
        selectAccountOptions();

        driver.findElement(openAccountButton).click();

    }

    public String getSuccessfulOpeningAccountLabelText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successfulOpeningAccountLabel));
        return driver.findElement(successfulOpeningAccountLabel).getText();
    }
}
