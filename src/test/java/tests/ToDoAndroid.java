package tests;

import org.example.TestAutomation.CreateTaskPage;
import org.example.TestAutomation.TasksListPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.JsonReader;
import java.io.IOException;
import java.net.MalformedURLException;
public class ToDoAndroid extends TestBase {
    CreateTaskPage createTaskPage;
    TasksListPage taskListsPage;
    @DataProvider(name = "tasksData")
    public Object[][] parsedData() throws IOException, ParseException
    {
        return JsonReader.getJSONData("//Users//hussien//IdeaProjects//TestAutomationUniversity//Data//Tasks.json", "TasksData", 2);
    }
    @Test(dataProvider = "tasksData")
    public void test_addTask(String taskName, String taskDescription) throws MalformedURLException {
        Android_SetUp();
        taskListsPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListsPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskNote(taskDescription);
        createTaskPage.clickSaveBTN();
    }
}