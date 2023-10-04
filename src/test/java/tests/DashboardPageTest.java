package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.DashboardPageService;
import service.LoginPageService;

public class DashboardPageTest extends BaseTest {

    private LoginPageService loginPageService;
    private User user;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User("fo75jm@elwatar.com", "TMSonlAQA12Java");
    }

    @Test(description = "Verify rating changing", priority = 1)
    public void verifyRatingChangingTest() {
        final int POST_POSITION = 0;
        final String RATING = "5";
        DashboardPageService dashboardPageService = loginPageService
                .openLoginPage()
                .login(user)
                .clickEditPostLink()
                .setupRating(POST_POSITION, RATING)
                .clickUpdateButton(POST_POSITION);
        Assert.assertTrue(dashboardPageService.isSuccessMessageDisplayed(), "Rating hasn't been updated");
    }
}
