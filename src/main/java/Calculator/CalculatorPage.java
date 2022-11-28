//package Calculator;
//
//import io.appium.java_client.android.AndroidDriver;
//import net.serenitybdd.core.pages.PageObject;
//import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Managed;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//@RunWith(SerenityRunner.class)
//public class CalculatorPage extends PageObject {
//
//    @Managed(driver="appium")
//    WebDriver driver;
//
//   @Test
//    public void test() throws InterruptedException, MalformedURLException {
//
//       File app= new File(System.getProperty("user.dir")+"\\app\\Android-MyDemoAppRN.1.3.0.build-244.apk");
//
//       DesiredCapabilities cap =new DesiredCapabilities();
//
//       cap.setCapability("deviceName","Android Emulator");
//       cap.setCapability("platformName", "Android");
//       cap.setCapability("platformVersion", "10.0");
//       cap.setCapability("app",app.getAbsolutePath());
//       driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
//    }
//}
