package service;

import page.FeedGlobalPage;

public class FeedGlobalPageService {

    private FeedGlobalPage feedGlobalPage;

    public DashboardPageService clickEditPostLink() {
        feedGlobalPage = new FeedGlobalPage();
        feedGlobalPage.clickEditPostLink();
        return new DashboardPageService();
    }

    public boolean isFeedGlobalPageDisplayed() {
        feedGlobalPage = new FeedGlobalPage();
        return feedGlobalPage.isFeedGlobalPageDisplayed();
    }

    public LoginPageService logout() {
        feedGlobalPage = new FeedGlobalPage();
        feedGlobalPage.logout();
        return new LoginPageService();
    }
}
