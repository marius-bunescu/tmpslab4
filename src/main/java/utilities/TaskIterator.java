package utilities;

import domain.Task;

import java.util.Iterator;
import java.util.List;

public class TaskIterator implements Iterator<Task> {
    private List<Task> tasks;
    private int currentIndex = 0;

    public TaskIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < tasks.size();
    }

    @Override
    public Task next() {
        if (hasNext()) {
            Task task = tasks.get(currentIndex);
            currentIndex++;
            return task;
        }
        return null;
    }
}
