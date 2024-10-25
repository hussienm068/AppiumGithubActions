package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.TestAutomation.CreateTaskPage;
import org.example.TestAutomation.TasksListPage;
import tests.TestBase;

import java.net.MalformedURLException;

public class CreateNewTask extends TestBase
{
    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;
    @Given("Click Add new task")
    public void clickAddNewTask() throws MalformedURLException
    {
        Android_SetUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
    }

    @Given("Enter TaskName")
    public void enterTaskName()
    {
        createTaskPage.enterTaskName("Task 1");

    }

    @Given("Enter TaskDesc")
    public void enterTaskDesc()
    {
        createTaskPage.enterTaskNote("Desc 1");
    }

    @When("click save")
    public void clickSave()
    {
        createTaskPage.clickSaveBTN();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully()
    {

    }
}
