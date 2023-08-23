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
    @Given("user select uyrugu as other countries except turkey")
    public void user_select_uyrugu_as_other_countries_except_turkey() {

    }
    @Given("User select hasta turu")
    public void user_select_hasta_turu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Enter all other required data under the kisi bilgileri tab")
    public void enter_all_other_required_data_under_the_kisi_bilgileri_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Enter all required data under the iletisim ve diger bilgiler tab")
    public void enter_all_required_data_under_the_iletisim_ve_diger_bilgiler_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User clicks the kaydet button.")
    public void user_clicks_the_kaydet_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User assert the bilgi islem basarili pop-up")
    public void user_assert_the_bilgi_islem_basarili_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}