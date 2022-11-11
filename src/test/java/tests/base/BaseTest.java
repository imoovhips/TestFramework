package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realt_home.RealtHomePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

/**
 * Здесь указываются все общие параметры и методы для всех тестов, которые будут наследоваться от этого
 */
public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver); // создали новый экземпляр класса и отдали ему драйвер, чтобы он мог с ним работать
    protected RealtHomePage realtHomePage = new RealtHomePage(driver); // создали новый экземпляр класса и отдали ему драйвер, чтобы он мог с ним работать

    protected RealtListingPage realtListingPage = new RealtListingPage(driver);
    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true) // будет выполняться после каждого сьюита
    public void close() {
        if (HOLD_BROWSER_OPEN)
        {
            driver.quit(); // quit освобождает ресурсы, а close() только закрывает текущую вкладку
        }
    }
}


