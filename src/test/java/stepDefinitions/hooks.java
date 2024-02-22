package stepDefinitions;

import Utilities.baseDriver;
import org.junit.After;
import org.junit.Before;

public class hooks {

    @Before
    public void before(){

    }
    @After
    public void after(){
        if (baseDriver.getDriver()!=null)
        {
            baseDriver.DriverQuit();
        }

    }
}
