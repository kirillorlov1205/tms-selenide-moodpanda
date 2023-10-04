package service;

import page.DashboardPage;

public class DashboardPageService {

    private DashboardPage dashboardPage;

    public DashboardPageService setupRating(int ratingPosition, String rating) {
        dashboardPage = new DashboardPage();
        dashboardPage.setupRating(ratingPosition, rating);
        return this;
    }

    public DashboardPageService clickUpdateButton(int buttonPosition) {
        dashboardPage = new DashboardPage();
        dashboardPage.clickUpdateButton(buttonPosition);
        return this;
    }

    public boolean isSuccessMessageDisplayed() {
        dashboardPage = new DashboardPage();
        return dashboardPage.isSuccessMessageDisplayed();
    }
}
