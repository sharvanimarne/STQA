package com.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

    public static void main(String[] args) {

        // Step 1: Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Step 2: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Step 3: Open Google website
        driver.get("https://www.google.com");

        // Step 4: Locate search box and enter search query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.ENTER);

        // Step 5: Verify that search results page is displayed
        String pageTitle = driver.getTitle();

        if (pageTitle.contains("Selenium WebDriver")) {
            System.out.println("TEST PASSED: Search results displayed successfully.");
        } else {
            System.out.println("TEST FAILED: Search results not displayed.");
        }

        // Step 6: Close the browser
        driver.quit();
    }
}

