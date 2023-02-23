import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppointmentServiceTest {
    @Test
    public void testAppointmentService() {
        AppointmentService appointmentService = new AppointmentService();
        assertEquals(0, appointmentService.hashmapSize());
        Appointment appointment = new Appointment("1234567890", "2020/01/01",
                "Ensure that appointment is working properly");
        assertEquals("Success", appointmentService.addAppointment(appointment));
        assertEquals(1, appointmentService.hashmapSize());
        assertEquals("Success", appointmentService.deleteAppointment("1234567890"));
        assertEquals(0, appointmentService.hashmapSize());

    }

}
