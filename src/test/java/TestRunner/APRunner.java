package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\Features\\AsianPaints.feature",
glue="Step_Definition",
tags="@valid",
plugin= {"pretty", 
		"html:target/HTMLReports/AsianPaintsReport.html",	
		"json:target/JSONReports/AsianPaintsReport.json",
		"junit:target/JUNITReports/AsianPaintsReport.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)	


public class APRunner extends AbstractTestNGCucumberTests{

}
