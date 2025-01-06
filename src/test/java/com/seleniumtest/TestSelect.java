package com.seleniumtest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelect {

    @Test
    public void selectTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-practice.netlify.app/dropdowns");

        WebElement selectElement = driver.findElement(By.id("dropdown-menu"));

        Select select = new Select(selectElement);

        Thread.sleep(1500);

        select.selectByIndex(2);

        Thread.sleep(1500);

        select.selectByValue("Monaco");

        Thread.sleep(1500);

        select.selectByVisibleText("Uruguay");

        driver.quit();
    }

}
