package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OS_DocsPage {
    public OS_DocsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/nav/ul")
    public WebElement sideMenu;
    @FindBy(xpath = "(//div[@class=\"MuiListItemText-root\"])[1]")
    public WebElement Docs;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/header")
    public WebElement documents;
    @FindBy(xpath = "//*[@id=\"Menu.ngdFeaturesApi\"]")
    public WebElement ngdApi;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/header/h1")
    public WebElement   ngdApiOverview;
    @FindBy(xpath = "//*[@id=\"Menu.downloadsApi\"]")
    public WebElement downlApi;
    @FindBy(xpath = "//a[@href=\"/docs/downloads/overview\"]")
    public WebElement downloadOverview;
    @FindBy(xpath = "//*[@id=\"Menu.featuresApi\"]")
    public WebElement featureApi;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/header")
    public WebElement featureOveriew;
    @FindBy(xpath = "//*[@id=\"Menu.linkedIdentifiersApi\"]")
    public WebElement identifiersApi;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/header")
    public WebElement identOverview;
    @FindBy(xpath = "//*[@id=\"Menu.mapsApi\"]")
    public WebElement mapsApi;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/header")
    public WebElement mapsOverview;  //*[@id="root"]/div[2]/main/header/h1

    @FindBy(xpath = "//*[@id=\"Menu.matchApi\"]")
    public WebElement cleanseApi;
//    @FindBy(xpath = "")
//    public WebElement cleanOverw;
    @FindBy(xpath = "//*[@id=\"Menu.namesApi\"]")
    public WebElement namesApi;
//    @FindBy(xpath = "")
//    public WebElement namesOverw;
    @FindBy(xpath = "//*[@id=\"Menu.placesApi\"]")
    public WebElement placesApi;
//    @FindBy(xpath = "")
//    public WebElement placesOverw;
    @FindBy(xpath = "//*[@id=\"Menu.vectorApi\"]")
    public WebElement tileApi;
//    @FindBy(xpath = "")
//    public WebElement titleOverw;
    @FindBy(xpath = "//*[@id=\"Menu.oauthApi\"]")
    public WebElement authApi;
//    @FindBy(xpath = "")
//    public WebElement authOverw;


}
