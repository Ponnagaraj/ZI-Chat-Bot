package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions(features="E:\\Java\\ZIChatBot\\ZIChatBox\\src\\test\\resources\\ZIChatBox.feature", 
				glue="com.stepdefinition",
				dryRun=false,
				tags= {"@E2E"})
public class TestRunner {

}
