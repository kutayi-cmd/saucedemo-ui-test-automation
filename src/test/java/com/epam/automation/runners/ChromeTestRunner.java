package com.epam.automation.runners;

import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
public class ChromeTestRunner {
    static {
        System.setProperty("browser", "chrome");
    }
}