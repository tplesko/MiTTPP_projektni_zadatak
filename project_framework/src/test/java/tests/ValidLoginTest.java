package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.pages.ParaBankHomePage;
import org.example.pages.AccountsOverviewPage;

public class ValidLoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        ParaBankHomePage homePage = new ParaBankHomePage(driver);
        homePage.GoToHomePage();
        homePage.login("john", "demo");

        AccountsOverviewPage accountsPage = new AccountsOverviewPage(driver);
        String headerText = accountsPage.getAccountsOverviewHeaderText();
        Assert.assertTrue(headerText.contains("Accounts Overview"),
                "Accounts Overview stranica nije prikazana nakon validnog logina.");
        Assert.assertTrue(accountsPage.isUserLoggedIn(),
                "Korisnik nije logiran (logout link nije pronađen).");
    }
}
