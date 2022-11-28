package Steps;

import UiPage.DemoAppPage;
import net.thucydides.core.annotations.Step;

public class DemoAppSteps {

    DemoAppPage demopage;

    @Step("^Click on Preference$")
    public void preference() {

        demopage.selectPreference();
        demopage.selectPreferenceDependencies();
        demopage.checkWifi();
        demopage.selectWifiSettings();
        demopage.enterWifiName("Rachel");
        demopage.clickOkButton();
    }

    @Step("^Enter wifi name$")
    public void entername() {
      //  demopage.enterWifiName("Rachel");
     //   demopage.clickOkButton();
    }

    @Step("^close the application$")
    public void CloseTheApplication() {

        demopage.closeApplication();
    }


}



