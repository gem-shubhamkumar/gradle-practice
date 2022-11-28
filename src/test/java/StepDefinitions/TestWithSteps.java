//package StepDefinitions;
//
//import UiPage.DemoAppPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//
//public class TestWithSteps {
//
//@Steps
//    DemoAppPage stepClass;
//
//    @Given("step open the wifi settings page")
//    public void stepOpenTheWifiSettingsPage() {
//        stepClass.selectPreference();
//        stepClass.selectPreferenceDependencies();
//        stepClass.checkWifi();
//        stepClass.selectWifiSettings();
//        stepClass.enterWifiName("Rachel");
//        stepClass.clickOkButton();
//    }
//
//    @When("step should able to enter the name as {string}")
//    public void stepShouldAbleToEnterTheNameAs(String name) {
////        stepClass.enterWifiName(name);
////        stepClass.clickOkButton();
//    }
//
//    @Then("step close the application")
//    public void stepCloseTheApplication() {
//
//        stepClass.closeApplication();
//    }
//}
