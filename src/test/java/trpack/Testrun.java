package trpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(features="Features/aifeatures.feature",glue="sdpack",
dryRun=false,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/reports.html"},
tags={"@Login,@Logout,@Createjob"})
public class Testrun extends AbstractTestNGCucumberTests
{
	

}
 