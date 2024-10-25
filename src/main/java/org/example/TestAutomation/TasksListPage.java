package org.example.TestAutomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class TasksListPage extends PageBase
{
    public TasksListPage(AppiumDriver driver)
    {
        super(driver);
    }//End Constructor

    @AndroidFindBy(id = "com.jeffprod.todo:id/fab")
    WebElement addTaskBtn;

    public void clickAddTaskBtn()
    {
        click(addTaskBtn);
    }


}
