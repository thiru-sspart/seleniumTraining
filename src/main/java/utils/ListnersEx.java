package utils;

import org.testng.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.IAnnotation;
import org.testng.xml.XmlTest;
import pages.HomePage;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

public class ListnersEx implements IExecutionListener {


    public void onExecutionStart() {
        DriverUtil.launchDriver();
    }

    public void onExecutionFinish() {
        HomePage home= new HomePage();
        home.quitBrowser();
    }

}
