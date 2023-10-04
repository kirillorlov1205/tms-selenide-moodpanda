package service;

import model.User;
import page.LoginPage;

public class LoginPageService {

    private LoginPage loginPage;

    public LoginPageService openLoginPage() {
        loginPage = new LoginPage();
        loginPage.openLoginPage();
        return this;
    }

    public FeedGlobalPageService login(User user) {
        loginPage = new LoginPage();
        loginPage.enterEmail(user.getUserEmail())
                .enterPassword(user.getUserPassword())
                .clickLoginButton();
        return new FeedGlobalPageService();
    }

    public boolean isIncorrectCredentialsValidationMessageDisplayed() {
        loginPage = new LoginPage();
        return loginPage.isIncorrectCredentialsValidationMessageDisplayed();
    }
}
