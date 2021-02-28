package Com.Package.Buggy.StepDefintions;
import Com.Package.Buggy.Pages.Pages;
import Com.Package.Buggy.Utilities.Utils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
public class Stepdefinitions extends Utils {
    public static WebDriver driver;
    public static Pages pages;

    public Stepdefinitions() throws IOException {
        super();
        driver = Utils.initializeBrowser();
        pages = PageFactory.initElements(driver, Pages.class);
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        kill();
    }

    @Given("^User is on the BuggyCarsRating Website Registration page (.+)$")
    public void user_is_on_the_buggycarsrating_website_registration_page(String actualTitle) throws Throwable {
        Utils.VerifyPageTitle(actualTitle);
    }

    @When("^he enters all required registration fields (.+),(.+),(.+),(.+)$")
    public void he_enters_all_required_registration_fields_(String username, String firstname, String lastname, String password) throws Throwable {
        Pages.Register(username, firstname, lastname, password);
    }

    @Then("^a BuggyCarsRating login is created (.+)$")
    public void a_buggycarsrating_login_is_created(String expectedmsg) throws Throwable {
        pages.VerifyRegistrationSuccessfull(expectedmsg);
    }

    @And("^click on Register button$")
    public void click_on_register_button() throws Throwable {
        pages.register.click();
    }

    @Given("^User is logged into BuggyCarsRating Website (.+),(.+)$")
    public void user_is_logged_into_buggycarsrating_website_(String username, String password) throws Throwable {
        pages.Login(username, password);
    }

    @When("^user clicks on Lamborghini image$")
    public void user_clicks_on_lamborghini_image() throws Throwable {
        Pages.lamborghiniButton.click();
    }

    @Then("^Lamborghini Models listed with their Rank Votes and comments$")
    public void lamborghini_models_listed_with_their_rank_votes_and_comments() throws Throwable {
     pages.PrintTable();
    }

    @And("^user verifies Lamborghini image on home page under Popular Make category (.+)$")
    public void user_verifies_lamborghini_image_on_home_page_under_popular_make_category(String expectedpouplarmake) throws Throwable {
        pages.VerifyImageOnHomePage(expectedpouplarmake, Pages.verifyPopularMake_Lamborghini);
    }

    @And("^Lamborghini Diablo image is on home page under Popular Model category (.+)$")
    public void lamborghini_diablo_image_is_on_home_page_under_popular_model_category(String expectedpouplarmodel) throws Throwable
    {
        pages.VerifyImageOnHomePage(expectedpouplarmodel, Pages.verifyPopularMake_LamborghiniDiablo);
    }

    @When("^user clicks on Lamborghini Diablo image$")
    public void user_clicks_on_lamborghini_diablo_image() throws Throwable {
        Pages.diabloButton.click();
    }

    @Then("^Lamborghini Diablo Model listed with Specification and Votes (.+), (.+)$")
    public void lamborghini_diablo_model_listed_with_specification_and_votes_(String expectedspecs, String expectedvotes) throws Throwable
        {
            pages.VerifySpecsAndVotes(expectedspecs, expectedvotes);
        }
    @And("^Overall Rating category should be displayed (.+)$")
    public void overall_rating_category_should_be_displayed(String expectedrating) throws Throwable
    {
     pages.VerifyOverAllRating(expectedrating, Pages.verifyOverAllRatings);
    }
    @When("^user clicks on List of all registered models image$")
    public void user_clicks_on_list_of_all_registered_models_image() throws Throwable
    {
        Pages.overAllRatingsBtn.click();
    }
    @And("^user clicks on Zonda model under Pagani Make category$")
    public void user_clicks_on_zonda_model_under_pagani_make_category() throws Throwable
    {
      Pages.paganiZonda.click();
    }
    @Then("^Pagani Zonda Model listed with Specification and Votes (.+), (.+)$")
    public void pagani_zonda_model_listed_with_specification_and_votes_(String expectedspecs, String expectedVotes) throws Throwable
    {
        //Pages.paganiZonda.click();
        pages.VerifySpecsAndVotes(expectedspecs, expectedVotes);
    }
    @Then("^all registered models listed with overall rank Votes Engine Comments$")
    public void all_registered_models_listed_with_overall_rank_votes_engine_comments() throws Throwable {
        pages.PrintTable();
    }




}
