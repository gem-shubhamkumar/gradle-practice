package StepDefinitions;

import Steps.DemoAppSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DemoAppTest {

    @Steps
    DemoAppSteps demotest;


    @Given("step open the wifi settings page")
    public void stepOpenTheWifiSettingsPage() {
//        System.out.println("given");
        demotest.preference();
    }

    @When("step should able to enter the name as {string}")
    public void stepShouldAbleToEnterTheNameAs(String name) {
        demotest.entername();
//        System.out.println("when");

    }

    @Then("step close the application")
    public void stepCloseTheApplication()  {

    }

    @And("perform long press feature")
    public void performLongPressFeature() throws InterruptedException {
    }
}