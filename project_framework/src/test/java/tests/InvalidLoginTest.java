package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.pages.ParaBankHomePage;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void testInvalidLogin() {
        ParaBankHomePage homePage = new ParaBankHomePage(driver);
        homePage.GoToHomePage();
        homePage.login("invalidUser", "invalidPass");

        String error = homePage.loginError();
        Assert.assertTrue(error.length() > 0, "Error poruka nije prikazana za neispravan login.");
    }
}
