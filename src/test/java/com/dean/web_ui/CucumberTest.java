package com.dean;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.dean"},
        features = {"src/test/resources"},
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
)
public class CucumberTest {
}

