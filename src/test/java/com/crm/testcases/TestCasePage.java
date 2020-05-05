package com.crm.testcases;

import com.crm.base.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasePage extends Base {
    public TestCasePage()
    {
        super();
    }

    @BeforeClass
    public void setup()
    {
        Initialisation();
    }

    @Test(priority = 0)
    public void testLoginButtonClick()
    {

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
