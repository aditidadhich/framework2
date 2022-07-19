package AssignmentCode;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Assignment.feature", glue = {
		"AssignmentCode" }, monochrome = true, tags = "@accenture or @capgemini", plugin = { "pretty", "html:Reports/htmlReportPara/html",
				"json:Reports/JsonReportPara/Cucumber.json", "junit:Reports/JunitReportPara/report.xml" })
public class TestRunnerAssignment {

}