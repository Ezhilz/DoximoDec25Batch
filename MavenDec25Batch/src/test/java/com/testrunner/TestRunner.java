package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Feature/facebooklogin.feature"},glue= {"com.stepdefinition"},dryRun=false,
monochrome=true,plugin= {"pretty","html:src/test/resources/Feature/report.html","json:src/test/resources/Feature/report.json"},
tags="@Arun")


public class TestRunner {

}
