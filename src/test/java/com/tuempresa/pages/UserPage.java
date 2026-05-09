package com.tuempresa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserPage extends BasePage {

    // Locators
    private By nameInput = By.id("name");

    private By jobInput = By.id("job");

    private By createButton = By.className("create-btn");

    private By userList = By.id("userList");

    // Constructor
    public UserPage(WebDriver driver) {

        super(driver);

    }

    // Acción escribir nombre
    public void enterName(String name) {

        type(nameInput, name);

    }

    // Acción escribir job
    public void enterJob(String job) {

        type(jobInput, job);

    }

    // Acción click create
    public void clickCreateUser() {

        click(createButton);

    }

    // Valida si usuario aparece
    public boolean isUserDisplayed(String userName) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        return wait.until(driver ->
                driver.findElement(userList)
                        .getText()
                        .contains(userName)
        );

    }

}