package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
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
   1) Launch the Browser and Navigate to home page
   2) Scroll down and click accept button
   3) User verifies that data hub page is loaded
   4) User verifies the dashboard page
   5) Then verify download page is loaded
   6) User verifies support page is loaded successfully
   7) Verify pricing page is loaded
   8) Click on 'Docs’ page
   9) Verify the lists of objects on side menu by expanding the links
  */
public class OS_TC_01StepDefs {
    OS_HomePage osHomePage = new OS_HomePage();
    OS_DocsPage osDocsPage = new OS_DocsPage();
  //    1) Launch the Browser and Navigate to home page
     @Given("Launch the Browser and Navigate to home page")
     public void launch_the_browser_and_navigate_to_home_page() {
         Driver.getDriver().get(ConfigReader.getProperty("os_homepage_url"));
     }
  // 2) Scroll down and click accept button
      @Then("Scroll down to click accept button")
      public void scroll_down_to_click_accept_button(){
      Driver.getDriver().findElement(By.xpath("//*[@id=\"ccc-notify-accept\"]/span"));
        Driver.waitAndClick(osHomePage.acceptButton);
     }
     //  3) User verifies that data hub page is loaded
    @Then("User verifies that data hub page is loaded")
    public void user_verifies_that_data_hub_page_is_loaded() throws IOException{
         Assert.assertTrue(osHomePage.datahub.isDisplayed());
         Driver.wait(2);
         ReusableMethods.getScreenshot("hub page");
    }
     // 4) User verifies the dashboard page
    @Then("User verifies the dashboard page")
    public void user_verifies_the_dashboard_page() {
        Driver.waitAndClick(osHomePage.apiDash);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("dashboard_url"));
        Assert.assertTrue(osHomePage.dashboard.isDisplayed());
    }
     // 5) Then verify download page is loaded
    @Then("verify download page is loaded")
    public void verify_download_page_is_loaded()throws IOException {
         Driver.waitAndClick(osHomePage.download);
         Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("download_url"));
         Assert.assertTrue(osHomePage.opendata.isDisplayed());
         Driver.wait(2);
         ReusableMethods.getScreenshot("download page");
     }
     //  6) User verifies support page is loaded successfully
    @Then("User verifies support page is loaded successfully")
    public void user_verifies_support_page_is_loaded_successfully() {
        Driver.waitAndClick(osHomePage.support);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("support_url"));
        Assert.assertTrue(osHomePage.Support.isDisplayed());
    }
    //  7) Verify pricing page is loaded
    @Then("verify pricing page is loaded")
    public void verify_pricing_page_is_loaded() {
        Driver.waitAndClick(osHomePage.pricing);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pricing_url"));
        Assert.assertTrue(osHomePage.Apiplan.isDisplayed());
    }
    // 8) Click on ‘Docs’ page
        @When("click on 'Docs’ page")
        public void click_on_docs_page()throws IOException{
            Driver.waitAndClick(osHomePage.docs);
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("docs_url"));
            Driver.wait(5);
            ReusableMethods.getScreenshot("Docs");
    }
    //  9) Verify the lists of objects on side menu by expanding the links
       @When("Verify the lists of objects on side menu by expanding the links")
       public void verify_the_list_of_objects_on_the_side_menu_by_expanding_the_links()throws IOException {
         Driver.waitAndClick(osDocsPage.Docs);
        Assert.assertTrue(osDocsPage.documents.isDisplayed());
        Driver.waitAndClick(osDocsPage.ngdApi);
        Assert.assertTrue(osDocsPage.ngdApiOverview.isDisplayed());
        Driver.waitAndClick(osDocsPage.downlApi);
        Assert.assertTrue(osDocsPage.downloadOverview.isDisplayed());
           Driver.wait(2);
           ReusableMethods.getScreenshot("downlApi");
        Driver.waitAndClick(osDocsPage.featureApi);
        Assert.assertTrue(osDocsPage.featureOveriew.isDisplayed());
        Driver.waitAndClick(osDocsPage.identifiersApi);
        Driver.waitAndClick(osDocsPage.mapsApi);
        Driver.waitAndClick(osDocsPage.cleanseApi);
        Driver.waitAndClick(osDocsPage.namesApi);
        Driver.waitAndClick(osDocsPage.placesApi);
        Driver.waitAndClick(osDocsPage.tileApi);
        Driver.waitAndClick(osDocsPage.authApi);
        Driver.wait(2);
        ReusableMethods.getScreenshot("authApi)");
       }
}
