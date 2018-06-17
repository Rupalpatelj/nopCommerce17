package com.maven.training;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@rk", dryRun = false, strict = true, plugin = "json:target/cucumber.json")
public class RunCukesTest {
}
