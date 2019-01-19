package WebTest1;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    public void Registar(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement((By.id("btnLogin"))).click();
    }
}
