package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

/**
 * Базовая логика для всех страниц, которая будет содержаться у всех наследников данного класса
 */
public class BasePage {
    protected WebDriver driver; // создали экземпляр драйвера

    // добавили конструктор и передали туда Webdriver driver:

    public BasePage(WebDriver driver) {
        this.driver = driver; //  и установили его в текущую переменную
    }

    public void open(String url) { // общий метод для открытия страниц (почитать про Селеноид)
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) { // общий метод для ожидания появления элемента на странице
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
