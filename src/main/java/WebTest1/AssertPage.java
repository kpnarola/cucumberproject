package WebTest1;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AssertPage extends Utils{

public void registerSuccessMessage (){

    String expectedRegisterSuccessMessage = "Welcome Admin";
    String actualeRegisterSuccessMessage = driver.findElement(By.id("welcome")).getText();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(expectedRegisterSuccessMessage,actualeRegisterSuccessMessage);
    softAssert.assertAll();

}

}
