package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup() {
        System.out.println("This is Before Method");
    }
    @After("@hooks_feature")
    public void teardown(Scenario scenario) {
        System.out.println("This is After Method");

        if(scenario.isFailed()){
            final byte[] screenshot =  ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshots");
        }


    }
}
