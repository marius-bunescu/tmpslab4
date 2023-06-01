package utilities;

import domain.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private List<TaskObserver> observers = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(tasks);
        }
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task.getName());
        }
    }
}
