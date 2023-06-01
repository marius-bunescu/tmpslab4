package client;

import domain.Task;
import utilities.TaskManager;

public class TaskManagementApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Add tasks
        taskManager.addTask(new Task("Task 1 FrontEnd"));
        taskManager.addTask(new Task("Task 2 BackEnd"));
        taskManager.addTask(new Task("Task 3 Testing"));

        // Display tasks
        taskManager.displayTasks();
    }
}
