package lt.techin.create.an.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver){
        super(driver);
    }
   @FindBy(css = "[class='btn btn-outline-secondary btn-lg px-4']")
   WebElement creatAccontBnt;
   @FindBy(css = "#name")
   WebElement enterName;
   @FindBy(css = "#email")
   WebElement enterEmail;
   @FindBy(css = "#password")
    WebElement enterPasswrd;
   @FindBy(css = "#confirmPassword")
   WebElement confPasswrd;
   @FindBy(css = "[class='btn btn-lg btn-primary d-block w-100']")
   WebElement clickRegisterButton;
   @FindBy(css = "b")
    WebElement getSuccsessfulRegistrationText;
   @FindBy(css = ".d-grid.d-md-flex.gap-2.justify-content-md-start > .btn.btn-lg.btn-primary.me-md-2.px-4")
   WebElement clickLogin;
   @FindBy(css = "#user-id")
   WebElement userIdField;
    public void clickOnCreateAccount(){
        creatAccontBnt.click();
    }
    public void enterName() {
        enterName.sendKeys("Ulusa");
    }
    public void logEnterEmail() {
        enterEmail.sendKeys( "rugilka@google.com");
    }
    public void enterPassword() {
        enterPasswrd.sendKeys("rugilka123");
    }
    public String enterConfgPassword() {
//        String passwordFieldCopy  = createPasswrd.getAttribute("value");
        String password = "rugilka123";
        confPasswrd.sendKeys(password);
        return password;
    }
    public void clickOnRegisterBtn() {
        clickRegisterButton.click();
    }
    public void checkUserSuccsessfullRegistration() {
    }
    public void clickLogin() {
        clickLogin.click();
    }
    public void checkIfUserAccountExists() {
        userIdField.getText();
    }
}

