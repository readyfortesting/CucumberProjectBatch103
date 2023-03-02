package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage;

    @Given("Amazon sayfasina gidilir")
    public void amazon_sayfasina_gidilir() {
        Driver.getDriver().get("https://amazon.com");
    }
    @Then("Amazon sayfasinda selenium aratilir")
    public void amazon_sayfasinda_selenium_aratilir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}