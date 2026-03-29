package com.epam.automation.runners;

import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
public class FirefoxTestRunner {
    static {
        System.setProperty("browser", "firefox");
    }
}