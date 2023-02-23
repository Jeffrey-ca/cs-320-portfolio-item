import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskServiceTest {
    @Test
    public void testTaskService() {
        TaskService taskService = new TaskService();
        assertEquals(0, taskService.hashmapSize());
        Task task = new Task("1234567890", "Test task", "Ensure that task is working properly");
        assertEquals("Success", taskService.addTask(task));
        assertEquals(1, taskService.hashmapSize());
        assertEquals("Success", taskService.deleteTask("1234567890"));
        assertEquals(0, taskService.hashmapSize());
        assertEquals("Success", taskService.addTask(task));
        assertEquals(1, taskService.hashmapSize());
        assertEquals("Success", taskService.updateTask(task));
        assertEquals(1, taskService.hashmapSize());
    }
}
