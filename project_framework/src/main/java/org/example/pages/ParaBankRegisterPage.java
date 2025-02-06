package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBankRegisterPage {
    private WebDriver driver;

    private By firstNameField = By.id("customer.firstName");
    private By lastNameField = By.id("customer.lastName");
    private By addressField = By.id("customer.address.street");
    private By cityField = By.id("customer.address.city");
    private By stateField = By.id("customer.address.state");
    private By zipField = By.id("customer.address.zipCode");
    private By phoneField = By.id("customer.phoneNumber");
    private By SSNField = By.id("customer.ssn");
    private By usernameField = By.id("customer.username");
    private By passwordField = By.id("customer.password");
    private By confirmPasswordField = By.id("repeatedPassword");

    private By registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    public ParaBankRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void register(String firstName, String lastName, String address, String city, String state, String zip, String phone, String ssn, String username, String password, String confirmPassword) {
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).clear();
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(zipField).clear();
        driver.findElement(zipField).sendKeys(zip);
        driver.findElement(phoneField).clear();
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(SSNField).clear();
        driver.findElement(SSNField).sendKeys(ssn);
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).clear();
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
        driver.findElement(registerButton).click();
    }

    public boolean isRegistrationFormDisplayed() {
        return driver.findElement(firstNameField).isDisplayed();
    }
}
