package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\durai\\eclipse-workspace\\SampleMaven\\src\\test\\resources\\FeatureFiles\\Login.feature",
glue="org.stepdefinition",plugin="json:json_report\\jsonreport.json")
public class TestRunner {

	@AfterClass
	public static void report() {
	
		JvmReport.generateJvmReport("C:\\Users\\durai\\eclipse-workspace\\SampleMaven\\json_report\\jsonreport.json");
	}
}
