package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.OS_DocsPage;
import pages.OS_HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

/*
  Scenario:
  Using the URL https://osdatahub.os.uk, verify specific items/objects are loaded onto the page.
  Navigate through the header menu including verification steps to confirm that the correct page is showing
  and that chosen page objects are displayed. For the ‘Docs’ page, verify the items on the side menu and
  verify the links shown when you expand the listed sections under ‘OS Data Hub documentation’
  e.g. ‘OS Downloads API’, ‘OS Features API’, ‘OS Linked Identifiers API’ etc……
    Task 1:
    •	Create a new Selenium framework using Java within your preferred IDE.
    •	Create a single Cucumber feature file to verify the below scenario.
    •	Configure the framework to execute the test scenario against the Chrome browser. You need to show how to trigger this manually and also via the build process.
    •	Provide details related to test reports produced by the test execution.

    Test Execution Steps:
    i) Launch the Browser and Navigate to https://osdatahub.os.uk/
    ii) Hover over the mouse through the header menu
    iii) Verify specific items/objects are loaded onto the page
    iv) Click on ‘Docs’ page
    v) Verify the items on the side menu
    vi) Click on ‘OS Downloads API’’ link shown
    vii) Verify the objects are shown under the selected side menu link
 */
public class OS_TC_01StepDefs {
    OS_HomePage osHomePage = new OS_HomePage();
    OS_DocsPage osDocsPage = new OS_DocsPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Navigates to the home page")
    public void navigates_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("os_homepage_url"));
    }
   @Then("scroll down to click accept button")
   public void scroll_down_to_click_accept_button() {
        Driver.getDriver().findElement(By.xpath("//*[@id=\"ccc-notify-accept\"]/span"));
        Driver.waitAndClick(osHomePage.acceptButton);
    }
    @When("hover over the mouse on the header menu")
    public void hover_over_the_mouse_on_the_header_menu() throws IOException {
        actions.moveToElement(osHomePage.datahub).perform();
        Driver.wait(4);
        ReusableMethods.getScreenshot("header menu");
    }
    @Then("verify API Dashboard is visible")
    public void verify_api_dashboard_is_visible() {
        Assert.assertTrue(osHomePage.apiDash.isDisplayed());
    }
    @Then("verify Download is visible")
    public void verify_download_is_visible() {
        Assert.assertTrue(osHomePage.download.isDisplayed());
    }
    @Then("verify Docs is visible")
    public void verify_docs_is_visible() {
        Assert.assertTrue(osHomePage.docs.isDisplayed());
    }
    @Then("verify Support is visible")
    public void verify_support_is_visible() {
        Assert.assertTrue(osHomePage.download.isDisplayed());
    }
    @Then("verify Pricing is visible")
    public void verify_pricing_is_visible() {
        Assert.assertTrue(osHomePage.support.isDisplayed());
    }
    @When("user click on Docs")
    public void user_click_on_docs()throws IOException {
        Driver.waitAndClick(osHomePage.docs);
        Driver.wait(5);
        ReusableMethods.getScreenshot("click on Docs");
    }
    @When("verify the list of the objects are on side menu")
    public void verify_the_list_of_the_objects_are_on_side_menu() {
        Assert.assertTrue(osDocsPage.sideMenu.isDisplayed());
    }
    @When("click on ‘OS Downloads API’ link")
    public void click_on_os_downloads_api_link() throws IOException{
        Driver.waitAndClick(osDocsPage.downlApi);
        Driver.wait(5);
        ReusableMethods.getScreenshot("OS Downloads API");
    }
    @Then("verify ‘Overview’ displayed")
    public void verify_overview_displayed() {
        Assert.assertTrue(osDocsPage.overview.isDisplayed());
    }
    @Then("verify ‘Getting started guide’ visible")
    public void verify_getting_started_guide_visible() {
        Assert.assertTrue(osDocsPage.startGuide.isDisplayed());
    }
    @Then("verify ‘Technical specification’ visible")
    public void verify_technical_specification_visible()throws IOException {
        Assert.assertTrue(osDocsPage.techSpecific.isDisplayed());
        Driver.wait(2);
        ReusableMethods.getScreenshot("Technical specification’ visible");
    }
//    @Then("close the browser")
//    public void close_the_browser() {
//        Driver.closeDriver();
//
//    }
}
