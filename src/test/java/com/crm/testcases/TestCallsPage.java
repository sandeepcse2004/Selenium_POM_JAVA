package com.crm.testcases;

import com.crm.base.Base;
import com.crm.pages.CallsPage;
import com.crm.pages.CampaignsPage;
import com.crm.pages.homePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCallsPage extends Base {

    homePage hp;
    CallsPage cp;
    public TestCallsPage()
    {
        super();
    }

    @BeforeClass
    public void setup()
    {
        Initialisation();
        hp = new homePage();
        hp.clickLoginPage();
        hp.login(prop.getProperty("username"), prop.getProperty("password"));
        cp = hp.clickCallsLink();
    }

    @Test(priority = 0)
    public void testLoginButtonClick() throws Exception
    {
        cp.clickNewButton();
        cp.enterDuration("10");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
