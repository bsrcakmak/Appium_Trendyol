package stepdefinitions.Hesabim;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class AdresBilgilerim {

    @Given("Trendyol mobile application is launched")
    public void trendyolMobileApplicationIsLaunched() {

        Driver.getAppiumDriver().get(ConfigReader.getProperty("addBusra"));
    }

    @When("Login is done.")
    public void loginIsDone() {

        System.out.println();
    }
    @And("Click on Hesabim")
    public void clickOnHesabim() {
    }

    @And("Click on Hesap Ayarlarim")
    public void clickOnHesapAyarlarim() {
    }

    @And("Click on Adres Bilgilerim")
    public void clickOnAdresBilgilerim() {
    }

    @And("Click on Adres Ekle")
    public void clickOnAdresEkle() {
    }

    @And("Click on the {string} field in the Iletisim Bilgileri section.")
    public void clickOnTheAdFieldInTheIletisimBilgileriSection() {
    }

    @And("Enter a valid value in the {string} field.")
    public void enterAValidValueInTheAdField() {
    }

    @And("Click on Kaydet button")
    public void clickOnKaydetButton() {
    }

    @Then("Confirm that entering the name is accepted and it proceeds to the next field")
    public void confirmThatEnteringTheNameIsAcceptedAndItProceedsToTheNextField() {
    }
}
