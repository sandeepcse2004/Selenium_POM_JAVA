
package com.crm.pages;
import com.crm.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends Base {

    public homePage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement loginEmail;

    @FindBy(name = "password")
    WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")
    WebElement loginPage;

    @FindBy(xpath = "//*[@id=\"main-nav\"]/a[12]/span")
    WebElement formsPage;

    @FindBy(xpath = "//*[@id=\"main-nav\"]/a[11]/span")
    WebElement campaignPage;

    @FindBy(xpath = "//*[@id=\"main-nav\"]/a[8]/span")
    WebElement callsPage;

    @FindBy(xpath = "//*[@id=\"main-nav\"]/a[5]/span")
    WebElement dealsPage;

    public void clickLoginPage()
    {
        loginPage.click();
    }

    public String validateLoginpage()
    {
        return driver.getTitle();
    }

    public boolean checkUserNameSelectedAfterLogin()
    {
        return driver.findElement(By.className("user-display")).isDisplayed();
    }

    public void login(String userName, String password)
    {
        loginEmail.sendKeys(userName);
        loginPassword.sendKeys(password);
        loginButton.click();
    }

    public FormsPage clickFormsLink()
    {
    formsPage.click();
    return new FormsPage();
    }

    public CampaignsPage clickCampaignLink()
    {
        campaignPage.click();
        return new CampaignsPage();
    }

    public CallsPage clickCallsLink()
    {
        callsPage.click();
        return new CallsPage();
    }

    public DealsPage clickDealsLink()
    {
        dealsPage.click();
        return new DealsPage();
    }
}
