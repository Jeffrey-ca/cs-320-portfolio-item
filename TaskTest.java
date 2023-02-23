import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTest {
    @Test
    public void testTask() {
        Task task = new Task("1234567890", "Test task", "Ensure that task is working properly");
        assertEquals("1234567890", task.getTaskID());
        assertEquals("Test task", task.getTaskName());
        assertEquals("Ensure that task is working properly", task.getTaskDescription());
    }

    @Test
    public void testSetTaskName() {
        Task task = new Task("1234567890", "Test task", "Ensure that task is working properly");
        task.setTaskName("Test task 2");
        assertEquals("Test task 2", task.getTaskName());
    }

    @Test
    public void testSetTaskDescription() {
        Task task = new Task("1234567890", "Test task", "Ensure that task is working properly");
        task.setTaskDescription("Ensure that task is working properly 2");
        assertEquals("Ensure that task is working properly 2", task.getTaskDescription());
    }

    @Test
    public void testTaskIDLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("12345678901", "Test task", "Ensure that task is working properly");
        });
    }

    @Test
    public void testTaskNameLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("1234567890", "test Task test Task test Task test Task", "Ensure that task is working properly");
        });
    }

    @Test
    public void testTaskDescriptionLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("1234567890", "Test task", "Ensure that task is working properly Ensure that task is working properly Ensure that task is working properly Ensure that task is working properly");
        });
    }

    @Test
    public void testTaskIDNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task(null, "Test task", "Ensure that task is working properly");
        });
    }

    @Test
    public void testTaskNameNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("1234567890", null, "Ensure that task is working properly");
        });
    }

    @Test
    public void testTaskDescriptionNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task task = new Task("1234567890", "Test task", null);
        });
    }
    

}
