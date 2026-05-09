package com.tuempresa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    // Espera elemento visible
    protected WebElement waitVisibility(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );

    }

    // Click reutilizable
    protected void click(By locator) {

        waitVisibility(locator).click();

    }

    // Escribir reutilizable
    protected void type(By locator, String text) {

        waitVisibility(locator).sendKeys(text);

    }

    // Obtener texto
    protected String getText(By locator) {

        return waitVisibility(locator).getText();

    }

}