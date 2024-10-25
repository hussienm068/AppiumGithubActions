package org.example.TestAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CreateTaskPage extends PageBase
{
    public CreateTaskPage(AppiumDriver driver)
    {
        super(driver);
    }
    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextTitre")
    WebElement taskNameTitle ;

    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextNote")
    WebElement taskNameNote;

    @AndroidFindBy(id = "com.jeffprod.todo:id/editTextTag")
    WebElement taskNameTag;

    @AndroidFindBy(id = "com.jeffprod.todo:id/action_save")
    WebElement saveBTN;

    public void enterTaskName(String taskName)
    {
        clear(taskNameTitle);
        sendText(taskNameTitle , taskName);
    }
    public void enterTaskNote(String note)
    {
        clear(taskNameNote);
        sendText(taskNameNote , note);

    }
    public void clickSaveBTN()
    {
        click(saveBTN);
    }



}
