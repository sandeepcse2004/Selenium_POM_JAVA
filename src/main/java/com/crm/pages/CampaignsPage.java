package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage extends Base {
    public CampaignsPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[2]/button")
    WebElement templateButton;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/form/div[1]/div[1]/div/input")
    WebElement templateName;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/form/div[2]/div/input")
    WebElement templateSubject;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/form/div[1]/div[2]/div")
    WebElement templateType;

    @FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
    WebElement saveButton;

    public void clickTemplateButton()
    {
        templateButton.click();
        driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a")).click();
    }

    public void enterTemplateDetails(String name, String subject, String type)
    {
        templateName.sendKeys(name);
        templateSubject.sendKeys(subject);
        templateType.sendKeys(type);
        saveButton.click();
    }

    public String getEnteredName()
    {
        return driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[2]/a")).getText();
    }

    public String getEnteredSubject()
    {
        return driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[3]")).getText();
    }
}
