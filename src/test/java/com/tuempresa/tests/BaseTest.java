package com.tuempresa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setup() {

        // Configura chromedriver automáticamente
        WebDriverManager.chromedriver().setup();

        // Abre Chrome
        driver = new ChromeDriver();

        // Maximiza ventana
        driver.manage().window().maximize();

        // Navega a aplicación
        driver.get("http://localhost:8080");

    }

    @After
    public void tearDown() {

        // Cierra navegador
        driver.quit();

    }

}