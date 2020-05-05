package com.crm.testcases;

import com.crm.base.Base;
import com.crm.pages.DealsPage;
import com.crm.pages.homePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDealsPage extends Base {
    homePage hp;
    DealsPage dp;
    public TestDealsPage()
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
        dp = hp.clickDealsLink();
    }

    @Test(priority = 0)
    public void testLoginButtonClick()
    {
        dp.clickNewButton();
    }

    @Test(priority = 1)
    public void testEnterAllDetails() throws Exception
    {
        dp.enterTitle("Payment CLearance");
        dp.enterProbablity("30");
        dp.enterAmount("100");
        dp.enterAssignedTo("Sandeep tiwari");
        dp.enterStage("Research");
        dp.enterClosed();
        dp.enterSource("Partner");
        Thread.sleep(2000);
        dp.enterStatus("Active");
        Thread.sleep(2000);
        dp.enterType("New");
        dp.enterDate();
        Thread.sleep(30000);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
