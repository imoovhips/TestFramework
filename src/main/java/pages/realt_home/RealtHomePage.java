package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
// локаторы для этой страницы:
    private final By countRooms = By.id("rooms");
    private final By optionTwoRooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    private final By searchHouseButton = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    // действия для этой страницы:

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(optionTwoRooms).click();
        return this;
    }

    public RealtHomePage clickToFind () {
        WebElement searchHouseButtonWait = driver.findElement(searchHouseButton);
        waitElementIsVisible(searchHouseButtonWait).click();

        return this;
    }

}
