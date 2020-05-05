
package com.crm.testcases;
import com.crm.base.Base;
import com.crm.pages.homePage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class TestHomePage extends Base {
    homePage homePages;

    public TestHomePage() throws IOException
    {
        super();
    }

    @BeforeClass
    public void setup() throws IOException
    {
        Initialisation();
        homePages = new homePage();
    }



    @Test(priority = 0)
    public void testLoginButtonClick()
    {
        homePages.clickLoginPage();
    }

    @Test(priority = 1)
    public void testEnterLoginidPassword() throws Exception
    {
        homePages.login(prop.getProperty("username"), prop.getProperty("password"));
        String title = homePages.validateLoginpage();
        Assert.assertEquals(title, "Cogmento CRM");
        boolean isSelected = homePages.checkUserNameSelectedAfterLogin();
        Assert.assertEquals(isSelected, true);
    }

    @AfterClass
    public void tearDown() throws IOException
    {
       driver.quit();
    }
}
