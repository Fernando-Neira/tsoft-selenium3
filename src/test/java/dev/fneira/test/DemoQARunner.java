package dev.fneira.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "dev.fneira.steps",
        features = "src/test/resources/features"
)
public class DemoQARunner {

}