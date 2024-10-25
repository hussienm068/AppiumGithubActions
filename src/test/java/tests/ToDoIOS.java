package tests;

import org.example.TestAutomation.CreateTaskPage;
import org.example.TestAutomation.TasksListPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDoIOS extends TestBase
{
    CreateTaskPage createTaskPage;
    TasksListPage taskListsPage;
    @DataProvider(name = "tasks data")
    public Object [][] parsedData() throws IOException, ParseException
    {
        return JsonReader.getJSONData("//Users//hussien//IdeaProjects//TestAutomationUniversity//Data//Tasks.json" ,"TasksData" ,2 );
    }
    @Test(dataProvider="tasks data")
    public void test_addTask(String taskName , String taskDescription) throws MalformedURLException
    {
        iOS_SetUp("10000" , "iPhone 16 Pro" , "9DFEB488-6A4B-4B93-918E-8F6F35D99ECA" , "18.0" , "8200");
        taskListsPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListsPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskNote(taskDescription);
        createTaskPage.clickSaveBTN();
    }
    @Test(dataProvider="tasks data")
    public void test_addTask2(String taskName , String taskDescription) throws MalformedURLException
    {
        iOS_SetUp();
        taskListsPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListsPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskNote(taskDescription);
        createTaskPage.clickSaveBTN();
    }



}
