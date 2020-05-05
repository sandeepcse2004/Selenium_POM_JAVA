package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage extends Base {
    public contactPage()
    {
            PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main-nav\"]/a[3]")
    WebElement contactLink;

//    @FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
//    WebElement first_name;

    public void clickContactsLink()
    {
        contactLink.click();
    }

    public void enterFirstName(String firstName)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/input")).sendKeys(firstName);
    }

    public String getFirstName()
    {
//        return driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
//        ).getAttribute("value");
        return "";
    }

    public void clickNewButton()
    {
        driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a")).click();
    }

    public void clickShowFilterButton()
    {
        driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]")).click();
    }
}
