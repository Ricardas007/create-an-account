package lt.techin.create.an.account;

import org.junit.jupiter.api.Test;

import java.time.Duration;

public class CreateAccountTest extends BaseTest{
    @Test
    void createAccountTest() throws InterruptedException {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickOnCreateAccount();
        accountPage.enterPassword();
        accountPage.enterConfgPassword();
        accountPage.logEnterEmail();
        accountPage.enterName();
        accountPage.clickOnRegisterBtn();
        accountPage.checkUserSuccsessfullRegistration();
        Thread.sleep(Duration.ofSeconds(5));
//        accountPage.checkIfUserAccountExists();
    }

    @Test
    void logInToPage() throws InterruptedException{
        LoginPage logToPage = new LoginPage(driver);
        logToPage.logEnterEmail();
        logToPage.logEnterPassward();
        Thread.sleep(Duration.ofSeconds(7));
        logToPage.clickLogin();
        logToPage.clickOnLogButton();
    }

}
