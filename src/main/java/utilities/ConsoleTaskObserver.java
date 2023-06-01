package utilities;

import domain.Task;

import java.util.List;

public class ConsoleTaskObserver implements TaskObserver {
    @Override
    public void update(List<Task> tasks) {
        System.out.println("Tasks have been updated:");
        for (Task task : tasks) {
            System.out.println(task.getName());
        }
        System.out.println();
    }
}
