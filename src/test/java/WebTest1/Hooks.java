package WebTest1;

import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {
    @Before
    public void driverSetup(){

        System.setProperty("webdriver.chrome.driver", "src\\test\\ResourceFolder\\BrowserDriver\\chromedriver.exe");

      driver = new ChromeDriver();

        // Implicitly Wait for Driver
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Maximising Browser
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().fullscreen();

    }

}


