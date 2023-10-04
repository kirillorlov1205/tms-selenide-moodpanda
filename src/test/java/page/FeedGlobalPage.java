package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FeedGlobalPage {

    private static final String EDIT_POST_LINK = "//aside[contains(@class,'column')]//a[contains(@href,'mydata')]";
    private static final String READ_MORE_BUTTON = "//a[contains(text(),' READ MORE HERE ')]";
    private static final String LOGOUT_BUTTON = "//aside[contains(@class,'side-nav')]//a[contains(text(),'Logout')]";

    public DashboardPage clickEditPostLink() {
        $(By.xpath(EDIT_POST_LINK)).click();
        return new DashboardPage();
    }

    public boolean isFeedGlobalPageDisplayed() {
        return $(By.xpath(READ_MORE_BUTTON)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }

    public LoginPage logout() {
        $(By.xpath(LOGOUT_BUTTON)).click();
        return new LoginPage();
    }
}
