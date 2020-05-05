package com.crm.testcases;

import com.crm.base.Base;
import com.crm.pages.CampaignsPage;
import com.crm.pages.homePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCampaignsPage extends Base {

    homePage hp;
    CampaignsPage cp;
    public TestCampaignsPage()
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
        cp = hp.clickCampaignLink();
    }

    @Test(priority = 0)
    public void testTemplateButtonClick() throws Exception
    {
        cp.clickTemplateButton();
        cp.enterTemplateDetails("RCB","Royal Bangalore", "Email");
        String name = cp.getEnteredName();
        Assert.assertEquals(name, "RCB");
        String subject = cp.getEnteredSubject();
        Assert.assertEquals(subject,"Royal Bangalore");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
