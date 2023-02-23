import java.util.HashMap;

public class TaskService extends Task {
    private HashMap<String, Task> tasks = new HashMap<>();

    public String addTask(Task task) {
        String taskID = task.getTaskID();
        if (tasks.containsKey(taskID)) {
            throw new IllegalArgumentException("Task ID already exists");
        } else {
            tasks.put(taskID, task);
            return "Success";
        }
    }

    public String deleteTask(String taskID) {
        if (tasks.containsKey(taskID)) {
            tasks.remove(taskID);
            return "Success";
        } else {
            throw new IllegalArgumentException("Task ID does not exist");
        }
    }

    public String updateTask(Task task) {
        String taskID = task.getTaskID();
        if (tasks.containsKey(taskID)) {
            tasks.put(taskID, task);
            return "Success";
        } else {
            throw new IllegalArgumentException("Task ID does not exist");
        }
    }

    public int hashmapSize() {
        return tasks.size();
    }

    public HashMap<String, Task> getTasks() {
        return tasks;
    }
}
