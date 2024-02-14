package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/Feature/MyPractice.feature",glue={"stepDefinitions"},monochrome=true,
plugin= {"pretty","junit:target/JunitReports/report.xml","json:target/JSONReports/report.json","html:target/HTMLReports.html"}
)

public class TestRunner {
	


}
