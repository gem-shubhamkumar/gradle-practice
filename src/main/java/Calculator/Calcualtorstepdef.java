//package Calculator;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.cucumber.java.en.Given;
//import net.serenitybdd.core.pages.PageObject;
//import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Managed;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//@RunWith(SerenityRunner.class)
//public class DemoAppTest extends PageObject {
//
//    @Managed(driver="appium")
//    WebDriver driver;
//
// //   AndroidDriver driver;
//
//    @Given("launch the application")
//    public void launch_the_application_and_login_using_and() throws MalformedURLException {
//
//        File app= new File(System.getProperty("user.dir")+"\\app\\Android-MyDemoAppRN.1.3.0.build-244.apk");
//
//        DesiredCapabilities cap =new DesiredCapabilities();
//
//        cap.setCapability("deviceName","Android Emulator");
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion", "10.0");
//        cap.setCapability("app",app.getAbsolutePath());
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
//
//        System.out.println("App Launched");
//    }
//
//    @Given("enter {string} and {string}")
//    public void enter_username_and_password(String username, String password) {
//
////    WebElement ele;
////    ele = driver.findElement(Locator.inputusername).sendKeys(username);
//
//        WebElement ele1;
//        ele1 = driver.findElement(By.id("Username input field"));
//        ele1.sendKeys(username);
//    }
//}
