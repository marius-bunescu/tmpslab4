package utilities;

import domain.Task;

import java.util.List;

public interface TaskObserver {
    void update(List<Task> tasks);
}
