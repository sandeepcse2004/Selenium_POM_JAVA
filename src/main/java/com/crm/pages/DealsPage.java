package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DealsPage extends Base {
    public DealsPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
    WebElement newButtonClick;

    public void clickNewButton()
    {
        newButtonClick.click();
    }

    public void enterTitle(String title)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[1]/div[1]/div/div/input")).sendKeys(title);
    }

    public void enterProbablity(String probablity)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[7]/div[1]/div/div/input")).sendKeys(probablity);
    }

    public void enterAmount(String amount)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]" +
                "/form/div[7]/div[2]/div/div/input")).sendKeys(amount);
    }

    public void enterAssignedTo(String name)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[2]/div[1]/div/div")).sendKeys(name);
    }

    public void enterStage(String stage)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[8]/div[2]/div/div")).sendKeys(stage);
    }

    public void enterClosed()
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[9]/div[1]/div/div/label")).click();
    }

    public void enterSource(String source)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[11]/div[1]/div/div")).sendKeys(source);
    }

    public void enterStatus(String status)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[9]/div[2]/div/div")).sendKeys(status);
    }

    public void enterType(String type)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[10]/div[2]/div/div")).sendKeys(type + Keys.ARROW_DOWN);
    }

    public void enterDate()
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/" +
                "form/div[4]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[6]")).click();
    }


}
