package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.FeedGlobalPageService;
import service.LoginPageService;

public class LoginPageTest extends BaseTest {

    private LoginPageService loginPageService;
    private FeedGlobalPageService feedGlobalPageService;
    private User user;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        feedGlobalPageService = new FeedGlobalPageService();
        user = new User("fo75jm@elwatar.com", "TMSonlAQA12Java");
    }

    @Test(description = "Verify successful login", priority = 1)
    public void verifySuccessfulLoginTest() {
        loginPageService
                .openLoginPage()
                .login(user);
        Assert.assertTrue(feedGlobalPageService.isFeedGlobalPageDisplayed(), "Login failed");
    }

    @Test(description = "Verify validation while log in with wrong email", priority = 2)
    public void verifyWrongEmailValidationTest() {
        User userWithWrongEmail = new User("WrongEmail@gmail.com", "TMSonlAQA12Java");
        feedGlobalPageService.logout();
        loginPageService
                .openLoginPage()
                .login(userWithWrongEmail);
        Assert.assertTrue(loginPageService.isIncorrectCredentialsValidationMessageDisplayed(), "Wrong " +
                "credentials validation message hasn't been shown");
    }

    @Test(description = "Verify validation while log in with wrong password", priority = 3)
    public void verifyWrongPasswordValidationTest() {
        User userWithWrongPassword = new User("fo75jm@elwatar.com", "wrongPass");
        loginPageService
                .openLoginPage()
                .login(userWithWrongPassword);
        Assert.assertTrue(loginPageService.isIncorrectCredentialsValidationMessageDisplayed(), "Wrong " +
                "credentials validation message hasn't been shown");
    }
}
