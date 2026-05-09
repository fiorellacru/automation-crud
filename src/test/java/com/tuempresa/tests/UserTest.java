package com.tuempresa.tests;

import com.tuempresa.pages.UserPage;

import org.junit.Assert;
import org.junit.Test;

public class UserTest extends BaseTest {

    @Test
    public void shouldCreateUser() {

        // Instancia Page Object
        UserPage userPage = new UserPage(driver);

        // Escribe nombre
        userPage.enterName("Fiorella");

        // Escribe trabajo
        userPage.enterJob("QA Automation");

        // Click botón crear
        userPage.clickCreateUser();

        // Validación
        Assert.assertTrue(
                userPage.isUserDisplayed("Fiorella"));

    }

}