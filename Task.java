public class Task {
    private String taskID;
    private String taskName;
    private String taskDescription;

    public Task() {
        this.taskID = "";
        this.taskName = "";
        this.taskDescription = "";
    }

    private Boolean lengthAndString(int length, String s) {
        if (s == null || s.length() > length) {
            return false;
        } else {
            return true;
        }
    }

    public Task(String taskID, String taskName, String taskDescription) {
        if (!lengthAndString(10, taskID)) {
            throw new IllegalArgumentException("Task ID cannot be null or longer than 10 characters");
        }
        this.taskID = taskID;
        if (!lengthAndString(20, taskName)) {
            throw new IllegalArgumentException("Task Name cannot be null or longer than 20 characters");
        }
        this.taskName = taskName;
        if (!lengthAndString(50, taskDescription)) {
            throw new IllegalArgumentException("Task Description cannot be null or longer than 50 characters");
        }
        this.taskDescription = taskDescription;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        if (!lengthAndString(20, taskName)) {
            throw new IllegalArgumentException("Task Name cannot be null or longer than 20 characters");
        }
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        if (!lengthAndString(50, taskDescription)) {
            throw new IllegalArgumentException("Task Description cannot be null or longer than 50 characters");
        }
        this.taskDescription = taskDescription;
    }

    @Override
    public String toString() {
        return "Task{" + "taskID=" + taskID + ", taskName=" + taskName + ", taskDescription=" + taskDescription + '}';
    }

}