package completePractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="Automation/src/test/java/completePractice",
		glue={"Automation/src/test/java/completePractice"},
		plugin = {"AutomationResultReports.html"}
		)

@Test
public class RunnerSwagLabs 
{
	TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {

		if(testNGCucumberRunner == null){
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}
		return testNGCucumberRunner.provideFeatures();
	}
}