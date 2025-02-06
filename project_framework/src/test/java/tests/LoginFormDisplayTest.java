package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.pages.ParaBankHomePage;

public class LoginFormDisplayTest extends BaseTest {

    @Test
    public void testLoginFormIsDisplayed() {
        ParaBankHomePage homePage = new ParaBankHomePage(driver);
        homePage.GoToHomePage();
        Assert.assertTrue(homePage.isLoginFormDisplayed(),
                "Login forma nije prikazana na početnoj stranici.");
    }
}
