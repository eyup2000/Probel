package stepdefinitions;

import Pages.ProbelPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import utilities.ConfigReader;
import utilities.Driver;
import java.security.Key;

public class PatientRegistrationStepDefinitions {

    ProbelPage probelPage = new ProbelPage();

    @Given("user_is_on_the_polyclinic_examination_registration_page")
    public void user_is_on_the_polyclinic_examination_registration_page() {
        Driver.getDriver().get(ConfigReader.getProperty("qa_url_login"));
    }
    @Given("user enters user name")
    public void user_enters_user_name() throws InterruptedException {
        Thread.sleep(2000);
        probelPage.username.sendKeys("FAYTUG");
    }
    @Given("user enters password")
    public void user_enters_password() {
        probelPage.password.sendKeys("8001");
    }
    @Given("user enters webpassword")
    public void user_enters_wpassword() {
        probelPage.webpassword.sendKeys("3554");
    }
    @Given("user clicks the login button")
    public void user_clicks_the_login_button() throws InterruptedException {
        probelPage.loginButton.click();
        Thread.sleep(30000);
    }
    @Given("user clicks the patient button")
    public void user_clicks_the_patient_button() throws InterruptedException {
        probelPage.patient.click();
    }
    @Given("user enters institution")
    public void user_enters_institution() {
        probelPage.institution.sendKeys("27");
    }
    @Given("user enters institution details")
    public void user_enters_institution_details() {
        probelPage.institutionDetails.sendKeys("0");
    }
    @When("user confirms that they are on the Patient Registration page")
    public void user_confirms_that_they_are_on_the_patient_registration_page() {
        Assert.assertTrue(probelPage.patientType.isDisplayed());
    }
    @Then("user is on the Patient Registration page")
    public void user_is_on_the_patient_registration_page() {
        System.out.println("User is on the Patient Registration page");
    }

}