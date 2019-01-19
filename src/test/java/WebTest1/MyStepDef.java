package WebTest1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyStepDef extends Utils{
    RegistrationPage registrationPage= new RegistrationPage();
    AssertPage assertPage = new AssertPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {


    }

    @When("^user enter details$")
    public void user_enter_details() {
        registrationPage.Registar();



    }

    @Then("^user should be login$")
    public void user_should_be_login() {
        assertPage.registerSuccessMessage();

    }
}