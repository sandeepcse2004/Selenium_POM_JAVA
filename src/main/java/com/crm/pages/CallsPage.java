package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallsPage extends Base {

    public CallsPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
    WebElement newButtonClick;

    public void clickNewButton()
    {
        newButtonClick.click();
    }

    public void enterDuration(String duration)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/div/input")).sendKeys(duration);
    }
}
