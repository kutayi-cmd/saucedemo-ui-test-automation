package com.epam.automation.hooks;

import com.epam.automation.utils.ConfigReader;
import com.epam.automation.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void setUp() {
        //logger.info("...");

        String browser = System.getProperty("browser");

        if (browser == null || browser.isEmpty()) {
            browser = ConfigReader.getProperty("browser");
        }

        logger.info("Starting test execution on browser: {}", browser);
        DriverFactory.initDriver(browser);
        DriverFactory.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }
    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}