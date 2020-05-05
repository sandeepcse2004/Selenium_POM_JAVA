package com.crm.testcases;

import com.crm.base.Base;
import com.crm.pages.FormsPage;
import com.crm.pages.contactPage;
import com.crm.pages.homePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFormsPage extends Base {
    homePage hp;
    FormsPage fp;
    public TestFormsPage()
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
        fp = hp.clickFormsLink();
    }

    @Test(priority = 1)
    public void testFormNewClick() throws Exception
    {
        fp.clickFormsNewButton();
        fp.enterName("Apple");
        fp.enterIntroduction("Macbook");
        fp.selectActiveBox();
        fp.enterCompletionText("Air");
        fp.clickSave();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void testFormSaveData() throws Exception
    {
        String name = fp.getEnteredName();
        Assert.assertEquals(name, "Apple [Inactive]");
        fp = hp.clickFormsLink();
        name = fp.getNameFromTable();
        Assert.assertEquals(name, "Apple");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
