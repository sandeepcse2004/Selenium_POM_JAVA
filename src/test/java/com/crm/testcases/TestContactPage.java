package com.crm.testcases;

import com.crm.base.Base;
import com.crm.pages.contactPage;
import com.crm.pages.homePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestContactPage extends Base {
    contactPage cp;
    homePage hp;
    public TestContactPage()
    {
        super();
    }

    @BeforeClass
    public void setup()
    {
        Initialisation();
        cp = new contactPage();
        hp = new homePage();
        hp.clickLoginPage();
        hp.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 0)
    public void testContactsLinkClick()
    {
        cp.clickContactsLink();
    }

    @Test(priority = 1)
    public void testNewButtonClick() throws Exception
    {
        cp.clickNewButton();
        Thread.sleep(10000);
    }

    @Test(priority = 2)
    public void testShowFiltersClick() throws Exception
    {
        cp.clickShowFilterButton();
        Thread.sleep(10000);
    }

    @Test(priority = 3,enabled = false)
    public void testEnterContactDetails()
    {
        cp.enterFirstName("HBK");
        String firstName = cp.getFirstName();
        Assert.assertEquals(firstName, "HBK");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
