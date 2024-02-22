package Pages;

import Utilities.baseDriver;
import org.openqa.selenium.support.PageFactory;

public class dialogContent extends parent{


    public dialogContent(){
        PageFactory.initElements(baseDriver.getDriver(),this);
    }




}
