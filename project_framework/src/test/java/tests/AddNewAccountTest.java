package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.pages.ParaBankHomePage;
import org.example.pages.AccountsOverviewPage;
import org.example.pages.OpenNewAccountPage;

public class AddNewAccountTest extends BaseTest {

    @Test
    public void testAddNewAccount() {
        ParaBankHomePage homePage = new ParaBankHomePage(driver);
        homePage.GoToHomePage();
        homePage.login("john", "demo");

        AccountsOverviewPage accountsOverview = new AccountsOverviewPage(driver);
        Assert.assertTrue(accountsOverview.isUserLoggedIn(), "Korisnik nije logiran nakon prijave.");

        OpenNewAccountPage openNewAccountPage = accountsOverview.openNewAccount();
        Assert.assertTrue(openNewAccountPage.getHeaderText().contains("Open New Account"),
                "Stranica za otvaranje novog računa nije ispravno otvorena.");

        openNewAccountPage.openNewAccount();

        String successMessage = openNewAccountPage.getSuccessfulOpeningAccountLabelText();

        /*
        System.out.println("Poruka: " + successMessage);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */


        Assert.assertTrue(successMessage.length() > 0,
                "Poruka o uspješnom otvaranju računa nije prikazana.");

    }
}
