package com.test.tests;

import cucumber.runtime.model.CucumberFeature;
import cucumber.runtime.model.CucumberScenario;
import cucumber.runtime.model.CucumberTagStatement;
import org.testng.annotations.Test;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;


@Test
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.test.step.definitions"

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
