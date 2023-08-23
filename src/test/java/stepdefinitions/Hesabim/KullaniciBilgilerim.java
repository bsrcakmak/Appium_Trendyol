package stepdefinitions.Hesabim;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class KullaniciBilgilerim {
    @Given("Trendyol mobile application is launched-SLM")
    public void trendyolMobileApplicationIsLaunchedSLM() {
        Driver.getAppiumDriver().get(ConfigReader.getProperty("appSelma"));

    }

    @When("Login is done-SLM")
    public void loginIsDoneSLM() {
    }

    @And("click on Hesabim")
    public void clickOnHesabim() {
    }

    @And("click on Hesap Ayarlarim")
    public void clickOnHesapAyarlarim() {
    }

    @And("click on Kullanici Bilgilerim")
    public void clickOnKullaniciBilgilerim() {
    }

    @And("click on the {string} section")
    public void clickOnTheAdSoyadSection() {
    }

    @And("enter a valid value in the {string} field")
    public void enterAValidValueInTheAdSoyadField() {
    }

    @And("see registered e-mail address")
    public void seeRegisteredEMailAddress() {
    }

    @And("click on mobile phone section")
    public void clickOnMobilePhoneSection() {
    }

    @And("enter valid phone number")
    public void enterValidPhoneNumber() {
    }

    @And("click the Güncelle button")
    public void clickTheGuncelleButton() {
    }

    @And("Empty the Ad Soyad section")
    public void emptyTheAdSoyadSection() {
    }

    @Then("view the message {string}")
    public void viewTheMessageLutfenAdiniziVeSoyadiniziGiriniz() {
    }

    @And("Enter a name of more than {int} characters in the Name field")
    public void enterANameOfMoreThanCharactersInTheNameField(int arg0) {
    }

    @Then("view the message {string}\"")
    public void viewTheMessageAdAlaniKarakterdenFazlaOlamaz(int arg0) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }


    @And("enter a valid first name and empty the last name")
    public void enterAValidFirstNameAndEmptyTheLastName() {

    }

    @And("Enter a last name of more than {int} characters in the Name field")
    public void enterALastNameOfMoreThanCharactersInTheNameField(int arg0) {

    }

    @And("empty phone number field")
    public void emptyPhoneNumberField() {

    }

    @Then("view the mesaage {string}\"")
    public void viewTheMesaageTelefonNumarasiAlaniniDoldurunuz() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }


    @And("enter missing phone number")
    public void enterMissingPhoneNumber() {
        
    }

    @Then("view the mesaage {string}")
    public void viewTheMesaageGecerliBirTelefonNumarasiGiriniz() {
    }
}
