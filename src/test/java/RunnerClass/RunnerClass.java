package RunnerClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/FeatureFiles",
       tags= {"@abc"},
        glue="StepDef")


public class RunnerClass {
}
