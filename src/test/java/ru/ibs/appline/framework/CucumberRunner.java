package ru.ibs.appline.framework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ru/ibs/appline/framework/steps"},
        features = {"src/test/resources/"},
        tags = "@Test",
        plugin = {"pretty", "html:target/cucumber-report.html"
        }
)
public class CucumberRunner {
}