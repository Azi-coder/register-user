package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By signInButton = By.cssSelector("button[data-qa = login-button]");
    private By signUpButton = By.cssSelector("button[data-qa = signup-button]");
    private By signInEmail = By.cssSelector("input[data-qa = login-email]");

    private By signUpEmail = By.cssSelector("input[data-qa = signup-email]");
    private By signInPassword = By.cssSelector("input[data-qa = login-password]");

    private By nameInput = By.cssSelector("input[type = text]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String userEmail) {
        driver.findElement(signInEmail).sendKeys(userEmail);
    }

    public void setPassword(String userPassword) {
        driver.findElement(signInPassword).sendKeys(userPassword);
    }

    public void setsignInEmail(String s) {
        driver.findElement(signInEmail).sendKeys(s);
    }

    public void setsignUpEmail(String s) {
        driver.findElement(signUpEmail).sendKeys(s);
    }

    public void setsignInPassword(String s) {
        driver.findElement(signInPassword).sendKeys(s);
    }

    public void setnameInput(String s) {
        driver.findElement(nameInput).sendKeys(s);
    }

    public AccountPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new AccountPage(driver);
    }

    public SignedUpPage clickSignUpButton() {
        driver.findElement(signUpButton).click();
        return new SignedUpPage(driver);
    }


}
