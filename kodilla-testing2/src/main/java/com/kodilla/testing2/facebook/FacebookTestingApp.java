package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {
    public static final String XPATH_NAME = "//*[contains(@name, \"firstname\")]";
    public static final String XPATH_SURNAME = "//*[contains(@name, \"lastname\")]";
    public static final String XPATH_PHONE = "//*[contains(@name, \"reg_email__\")]";
    public static final String XPATH_PASSWORD = "//*[contains(@name, \"reg_passwd__\")]";
    public static final String XPATH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_NAME)).isDisplayed());

        WebElement nameField =  driver.findElement(By.xpath(XPATH_NAME));
        nameField.sendKeys("Michal");

        WebElement surnameField = driver.findElement(By.xpath(XPATH_SURNAME));
        surnameField.sendKeys("Test");

        WebElement phoneField = driver.findElement(By.xpath(XPATH_PHONE));
        phoneField.sendKeys("12345566");

        WebElement passField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passField.sendKeys("pass111");

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDayBoard = new Select(selectDay);
        selectDayBoard.selectByValue("15");

        while (!driver.findElement(By.xpath(XPATH_MONTH)).isDisplayed());

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonthBoard = new Select(selectMonth);
        selectMonthBoard.selectByValue("11");

        while (!driver.findElement(By.xpath(XPATH_YEAR)).isDisplayed());

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYearBoard = new Select(selectYear);
        selectYearBoard.selectByValue("1990");






    }
}
