package UiPage;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import static java.time.Duration.ofSeconds;

public class DemoAppPage extends PageObject {

    //Click Functions
//    @Managed(driver = "appium")
//    WebDriver driver;

    AndroidDriver driver = (AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();

    public void selectPreference() {

        clickOn(element(Locators.option_preference));

    }


    public void selectPreferenceDependencies() {

        $(Locators.option_prefDependencies).click();

    }


    public void checkWifi() {

        //  $(Locators.checkBox_Wifi).doubleClick();

        clickOn(element(Locators.checkBox_Wifi));


    }


    public void selectWifiSettings() {

        clickOn(element(Locators.option_wifiSettings));

    }

    //Send Keys Function
    public void enterWifiName(String name) {

        typeInto(element(Locators.input_wifiName), name);

        //   WebElement element = $(Locators.input_wifiName);
        //  typeInto(element, name);
    }


    public void clickOkButton() {

        clickOn(findAll(Locators.alert_buttons).get(1));
    }


    public void closeApplication() {

        try {
            Thread.sleep(2000);
            System.out.println("app closed!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    // Alert Function


    // LongPress Test
}
