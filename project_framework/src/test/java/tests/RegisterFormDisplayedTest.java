package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.pages.ParaBankHomePage;
import org.example.pages.ParaBankRegisterPage;

public class RegisterFormDisplayedTest extends BaseTest {

    @Test
    public void testRegisterFormDisplayed() {
        ParaBankHomePage homePage = new ParaBankHomePage(driver);
        homePage.GoToHomePage();
        homePage.goToRegisterPage();

        ParaBankRegisterPage registerPage = new ParaBankRegisterPage(driver);
        Assert.assertTrue(registerPage.isRegistrationFormDisplayed(),
                "Registracijska forma nije prikazana.");
    }
}
