package com.patterns.factory;

import com.patterns.BaseTest;
import com.patterns.TestDataProvider;
import com.patterns.factory.google.GoogleFactory;
import com.patterns.factory.google.GooglePage;
import org.testng.annotations.Test;

public class FactoryTest extends BaseTest {

    private GooglePage googlePage;

    @Test(dataProvider = "getSearchData", dataProviderClass = TestDataProvider.class)
    public void searchTest(String language, String keyword) {
        this.googlePage = GoogleFactory.get(language, this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
        int resultCount = this.googlePage.getResultsCount();
        System.out.println("Result Count : " + resultCount);
    }
}
