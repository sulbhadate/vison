package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeaturesFile"},
		glue= {"StepDefination"},
		dryRun=false,
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		
		
		
		)
public class TestRunnerClass extends AbstractTestNGCucumberTests{

}
