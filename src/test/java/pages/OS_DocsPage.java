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
    @FindBy(xpath = "//*[@id=\"Menu.ngdFeaturesApi\"]")
    public WebElement ngdApi;
    @FindBy(xpath = "//*[@id=\"Menu.downloadsApi\"]")
    public WebElement downlApi;
    @FindBy(xpath = "//*[@id=\"Menu.overview/docs/downloads/overview\"]/a")
    public WebElement overview;
    @FindBy(xpath = "//*[@id=\"Menu.gettingStarted/docs/downloads/gettingStarted\"]")
    public WebElement startGuide;
    @FindBy(xpath = "//*[@id=\"Menu.techSpec/docs/downloads/technicalSpecification\"]")
    public WebElement techSpecific;

}
