package lt.techin.create.an.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AccountPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input#email")
    WebElement logEmail;

    @FindBy(css = "#password")
    WebElement logPasswrd;

    public void logEnterEmail() {
        logEmail.sendKeys("rugilka@google.com");
    }

    public void logEnterPassward(){
        logPasswrd.sendKeys( "rugilka123");
    }

    @FindBy(css = ".btn.btn-lg.btn-primary.d-block.w-100")
    WebElement clickLogButton;

    public void clickLogin() {
        super.clickLogin();
    }

    public void clickOnLogButton() {
        clickLogButton.click();
    }
}
