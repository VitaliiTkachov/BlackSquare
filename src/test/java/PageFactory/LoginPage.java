package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(
            id = "userNameInput"
    )
    WebElement username;
    @FindBy(
            id = "passwordInput"
    )
    WebElement password;
    WebElement submitButton;

    public LoginPage() {
    }

    public void logIn(String email, String passwd) {
        this.username.clear();
        this.username.sendKeys(new CharSequence[]{email});
        this.password.sendKeys(new CharSequence[]{passwd});
        this.submitButton.submit();
    }
}
