package lt.techin.create.an.account;

import org.junit.jupiter.api.Test;

import java.time.Duration;

public class CreateAccountTest extends BaseTest{
    @Test
    void createAccountTest() throws InterruptedException {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickOnCreateAccount();
        accountPage.enterPassword();
//        Thread.sleep(Duration.ofSeconds(5));
        accountPage.enterConfgPassword();
        accountPage.logEnterEmail();
        accountPage.enterName();
//        Thread.sleep(Duration.ofSeconds(8));
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
        logToPage.clickLogin();
        Thread.sleep(Duration.ofSeconds(7));
        logToPage.clickOnLogButton();
    }

}
