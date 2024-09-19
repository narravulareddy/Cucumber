package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@Smoke and @Regression and not @perf", features= {"src/main/resources/FeaturesWithTags"},
                 glue= {"StepDefinitions"},
                 plugin= {"pretty","html:target/htmlreport.html"})
public class CucumberTestRunnerFortags extends AbstractTestNGCucumberTests {

}
