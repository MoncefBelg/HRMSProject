package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.PageInitializers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class CommonMethods extends PageInitializers {
    public static WebDriver driver;


    public static void openBrowserAndNavigateToURL() {
        ConfigReader.readProperties(Constants.CONFIG_READER_PATH);
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox;":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        initializePageObject();
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement dialogBox) {
        dialogBox.clear();
        dialogBox.sendKeys(text);
    }

    public static WebDriverWait getWait() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return webDriverWait;
    }

    public static void waitForElementToBeClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void click(WebElement element) {
        waitForElementToBeClickable(element);
        element.click();
    }

    public static void singleSelectFromDropdownsUsingText(String text, WebElement element) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void singleDeselectFromDropdownsUsingText(String text, WebElement element) {
        Select select = new Select(element);
        select.deselectByVisibleText(text);
    }

    public static void singleSelectFromDropdownsUsingValue(String value, WebElement element) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void singleDeselectFromDropdownsUsingValue(String value, WebElement element) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }

    public static void singleSelectFromDropdownsUsingIndex(int index, WebElement element) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void singleDeselectFromDropdownsUsingIndex(int index, WebElement element) {
        Select select = new Select(element);
        select.deselectByIndex(index);
    }

    public static String getTimeStamp(String pattern) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public byte[] screenShot(String fileName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        byte[] pictures = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(Constants.SCREENSHOT_FILE_PATH + fileName + " " + getTimeStamp("YYYY-MM-dd-HH-mm-ss") + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pictures;
    }

    public static Select getSelect(WebElement element) {
        Select select = new Select(element);
        return select;
    }

    public static void calendarDaySelect(List<WebElement> calendarDate, String day) {
        for (WebElement dates : calendarDate) {
            if (dates.getText().equals(day)) {
                dates.click();
                break;
            }
        }
    }

    public static void calendarSelectDate(WebElement monthDD, String month, WebElement yearDD, String year, List<WebElement> calendarDate, String day) {
        getSelect(monthDD).selectByVisibleText(month);
        getSelect(yearDD).selectByVisibleText(year);
        calendarDaySelect(calendarDate, day);
    }

    public static void fileUpload(WebElement element, String path) {
        element.sendKeys(path);
    }

    public static void waitForElementToBePresent(WebElement element, String actualMsg) {
        getWait().until(ExpectedConditions.textToBePresentInElement(element, actualMsg));
    }

    public static void checkBox(List<WebElement> allCheckBox, String value) {
        for (WebElement box : allCheckBox)
            if (box.getText().equals(value)) {
                box.click();
                break;
            }
    }

    public static void acceptAlert(WebElement element) {
        element.click();
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.accept();
    }

    public static void dismissAlert(WebElement element) {
        element.click();
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.dismiss();
    }

    public static void sendKeysAlert(WebElement element, String value) {
        element.click();
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.sendKeys(value);
        confirmationAlert.accept();
    }
}




