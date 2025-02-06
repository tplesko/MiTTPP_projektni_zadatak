package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.pages.ParaBankHomePage;
import org.example.pages.ParaBankRegisterPage;
import org.example.pages.AccountsOverviewPage;

public class RegisterNewUserTest extends BaseTest {

    @Test
    public void testRegisterNewUser() {
        String uniqueUsername = "user" + System.currentTimeMillis();

        ParaBankHomePage homePage = new ParaBankHomePage(driver);
        homePage.GoToHomePage();
        homePage.goToRegisterPage();

        ParaBankRegisterPage registerPage = new ParaBankRegisterPage(driver);
        registerPage.register("TestFirstName", "TestLastName", "Test Address", "TestCity", "TestState",
                "12345", "1234567890", "123-45-6789", uniqueUsername, "password", "password");

        AccountsOverviewPage accountsPage = new AccountsOverviewPage(driver);
        String headerText = accountsPage.getAccountsOverviewHeaderText();
        Assert.assertTrue(headerText.contains("Accounts Overview"),
                "Registracija nije dovela do učitavanja Accounts Overview stranice.");
        Assert.assertTrue(accountsPage.isUserLoggedIn(),
                "Korisnik nije logiran nakon registracije (logout link nije pronađen).");
    }
}
