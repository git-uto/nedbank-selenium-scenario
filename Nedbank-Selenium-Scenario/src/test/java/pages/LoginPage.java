package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='txt-username']")
    private WebElement TXT_USER_NAME;
    @FindBy(xpath = "//input[@id='txt-password']")
    private WebElement TXT_PASSWORD;
    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement BTN_LOGIN;

    public void userLogin(String username, String password)
    {
        TXT_USER_NAME.sendKeys(username);
        TXT_PASSWORD.sendKeys(password);
        BTN_LOGIN.click();
    }
}
