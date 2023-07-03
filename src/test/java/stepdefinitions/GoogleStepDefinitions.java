package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GooglePage googlePage=new GooglePage();

    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

        //CEREZ CIKAN ARKADASLAR ICIN
        try {
        googlePage.popUpaccept.click();
        }catch (Exception e){

        }

    }
    @When("kullanici iphone için arama yapar")
    public void kullanici_iphone_için_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        googlePage.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }
    @Then("close the application")
    public void close_the_application() {
    Driver.closeDriver();
    }

    @When("kullanici tesla için arama yapar")
    public void kullanici_tesla_için_arama_yapar() {
        googlePage.searchBox.sendKeys("tesla"+ Keys.ENTER);
    }
    @Then("sonuclarda tesla oldugunu dogrular")
    public void sonuclarda_tesla_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tesla"));
    }

}
