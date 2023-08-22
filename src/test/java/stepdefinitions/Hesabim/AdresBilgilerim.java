package stepdefinitions.Hesabim;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdresBilgilerim {

    @Given("Trendyol mobile application is launched-BSR")
    public void trendyolMobileApplicationIsLaunched() {

        Driver.getAppiumDriver().get(ConfigReader.getProperty("appBusra"));
        ReusableMethods.scrollTopJS();

    }

    @When("Login is done.")
    public void loginIsDone() {


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

    @And("Click on the {string} field in the Iletisim Bilgileri section and enter a valid value in the {string} field.")
    public void clickOnTheAdFieldInTheIletisimBilgileriSectionAndEnterAValidValueInTheAdField() {
    }

    @And("Click on the {string} field in the Iletisim Bilgileri section and enter a valid value in the {string} field")
    public void clickOnTheSoyadFieldInTheIletisimBilgileriSectionAndEnterAValidValueInTheSoyadField() {
    }

    @And("Click on the {string} section in the Adres Bilgileri field and choose a city from the opened list.")
    public void clickOnTheIlSectionInTheAdresBilgileriFieldAndChooseACityFromTheOpenedList() {
    }

    @And("Click on the {string} section in the Adres Bilgileri field and choose a district from the opened list.")
    public void clickOnTheIlceSectionInTheAdresBilgileriFieldAndChooseADistrictFromTheOpenedList() {
    }

    @And("Click on the {string} section in the Adres Bilgileri field and choose a neighbourhood from the opened list.")
    public void clickOnTheMahalleSectionInTheAdresBilgileriFieldAndChooseANeighbourhoodFromTheOpenedList() {
    }

    @And("Click on the {string} field in the Adres Bilgileri section and enter a valid value in the {string} field.")
    public void clickOnTheAdresFieldInTheAdresBilgileriSectionAndEnterAValidValueInTheAdresField() {
    }

    @And("Select the invoice type as Kurumsal.")
    public void selectTheInvoiceTypeAsKurumsal() {
    }

    @And("Click on the {string} field in the Fatura Turu section and enter a valid value in the {string} field.")
    public void clickOnTheVKNFieldInTheFaturaTuruSectionAndEnterAValidValueInTheAdField() {
    }

    @Then("Confirm that the new address has been added to the address details list.")
    public void confirmThatTheNewAddressHasBeenAddedToTheAddressDetailsList() {
    }

//    @And("Click on the Ad field in the Iletisim Bilgileri section.")
//    public void clickOnTheAdFieldInTheIletisimBilgileriSection() {
//    }

//    @And("Click on the Soyad field in the Iletisim Bilgileri section.")
//    public void clickOnTheSoyadFieldInTheIletisimBilgileriSection() {
//    }

//    @And("Enter a valid value in the Ad field.")
//    public void enterAValidValueInTheAdField() {
//    }
}
