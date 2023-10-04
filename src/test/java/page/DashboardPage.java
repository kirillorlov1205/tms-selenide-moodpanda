package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {

    private static final String RATING_SELECT = "//td//select";
    private static final String UPDATE_BUTTON = "//button[contains(@class,'is-outdlined')]";
    private static final String SUCCESS_MESSAGE = "//*[contains(text(), 'Post updated')]";

    public DashboardPage setupRating(int ratingPosition, String rating) {
        $$(By.xpath(RATING_SELECT)).get(ratingPosition).selectOptionByValue(rating);
        return this;
    }

    public DashboardPage clickUpdateButton(int buttonPosition) {
        $$(By.xpath(UPDATE_BUTTON)).get(buttonPosition).click();
        return this;
    }

    public boolean isSuccessMessageDisplayed() {
        return $(By.xpath(SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
}
