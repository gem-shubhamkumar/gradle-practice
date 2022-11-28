package UiPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    public static By option_preference = AppiumBy.accessibilityId("Preference");
    public static By option_prefDependencies = AppiumBy.xpath("//android.widget.TextView[" +
            "@content-desc='3. Preference dependencies']");
    public static By checkBox_Wifi = AppiumBy.id("android:id/widget_frame");
    public static By option_wifiSettings = AppiumBy.xpath("(//android.widget.RelativeLayout)[2]");
    public static By input_wifiName = AppiumBy.id("android:id/edit");
    public static By alert_buttons = AppiumBy.className("android.widget.Button");

    public static By App = AppiumBy.accessibilityId("App");
    public static By alertDialogs = AppiumBy.accessibilityId("Alert Dialogs");
    public static By alertButton = AppiumBy.id("io.appium.android.apis:id/two_buttons");
    public static By alertOK = AppiumBy.id("android:id/button1");

    public static By views = AppiumBy.accessibilityId("Views");
    public static By expandableList = AppiumBy.accessibilityId("Expandable Lists");
    public static By customAdapter = AppiumBy.accessibilityId("1. Custom Adapter");

    public static By peopleName = AppiumBy.xpath("//android.widget.TextView[@text='People Names']");
}
