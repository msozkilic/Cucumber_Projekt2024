package Pages;

import Utilities.baseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dialogContent extends parent{


    public dialogContent(){

        PageFactory.initElements(baseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='pay_bills_tab']/a")
    private WebElement paybills;




}
