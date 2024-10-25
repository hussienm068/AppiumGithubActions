package org.example.TestAutomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase
{
    AppiumDriver driver;
    public static final Duration wait = Duration.ofSeconds(10);
    public PageBase(AppiumDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver) , this);
    }
    public void waitForVisibility(WebElement element)
    {
        WebDriverWait myWait = new WebDriverWait(driver , wait);
        myWait.until(ExpectedConditions.visibilityOf(element));

    }
    public void clear(WebElement element)
    {
        waitForVisibility(element);
        element.clear();

    }
    public void click(WebElement element)
    {
        waitForVisibility(element);
        element.click();
    }
    public void sendText(WebElement element , String text)
    {
     waitForVisibility(element);
        element.sendKeys(text);
    }
    public String getAttributeValue(WebElement element , String attribute)
    {
        waitForVisibility(element);
        String value = element.getAttribute(attribute);
        return value;
    }



}
