package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OS_HomePage {
    public OS_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"ccc-notify-accept\"]/span")
    public WebElement acceptButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/a")
    public WebElement datahub;
    @FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[1]")
    public WebElement apiDash;
    @FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[2]")
    public WebElement download;
    @FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[3]")
    public WebElement docs;
    @FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[4]")
    public WebElement support;
    @FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[5]")
    public WebElement pricing;

    @FindBy(xpath = "//div[@class=\"jss206\"]")
    public WebElement dashboard;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/header")
    public WebElement opendata;
    @FindBy(xpath= "//*[@id=\"top\"]" )
    public WebElement Support;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/header")
    public WebElement Apiplan;

}
