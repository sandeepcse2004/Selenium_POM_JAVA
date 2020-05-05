package com.crm.pages;

import com.crm.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends Base {
    public FormsPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main-nav\"]/a[12]/span")
    WebElement formsLink;


    public void clickFormsNewButton()
    {
        driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a")).click();;
    }

    public void enterName(String name)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/input")).sendKeys(name);
    }

    public String getEnteredName()
    {
        return driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]"))
                .getText();
    }

    public void enterIntroduction(String introduction)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/textarea")).sendKeys(introduction);
    }

    public String getNameFromTable()
    {
        //driver.switchTo().frame("formPreviewPanel");
        return driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText();
    }

    public void enterCompletionText(String completion)
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/textarea")).sendKeys(completion);
    }

    public boolean selectActiveBox()
    {
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/label")).click();
        return driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/label")).isSelected();
    }

    public void clickSave()
    {
        driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[3]")).click();
    }

}
