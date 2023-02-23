import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppointmentTest {
    @Test
    public void testAppointment(){
        Appointment appointment = new Appointment("1234567890", "2020/01/01", "Ensure that appointment is working properly");
        assertEquals("1234567890", appointment.getAppointmentID());
        assertEquals("Ensure that appointment is working properly", appointment.getAppointmentDescription());
        assertEquals("2020/01/01", appointment.getAppointmentDate());
    }

    @Test
    public void testSetAppointmentDescription(){
        Appointment appointment = new Appointment("1234567890", "2020/01/01", "Ensure that appointment is working properly");
        appointment.setAppointmentDescription("Ensure that appointment is working properly 2");
        assertEquals("Ensure that appointment is working properly 2", appointment.getAppointmentDescription());
    }

    @Test
    public void testSetAppointmentDate(){
        Appointment appointment = new Appointment("1234567890", "2020/01/01", "Ensure that appointment is working properly");
        appointment.setAppointmentDate("2020/01/02");
        assertEquals("2020/01/02", appointment.getAppointmentDate());
    }

    @Test
    public void testAppointmentIDLengthException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("12345678901", "2020/01/01", "Ensure that appointment is working properly");
        });
    }

    @Test
    public void testAppointmentDescriptionLengthException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("1234567890", "2020/01/01", "Ensure that appointment is working properly Ensure that appointment is working properly Ensure that appointment is working properly Ensure that appointment is working properly");
        });
    }

    @Test
    public void testAppointmentIDNullException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment(null, "2020/01/01", "Ensure that appointment is working properly");
        });
    }

    @Test
    public void testAppointmentDescriptionNullException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("1234567890", "2020/01/01", null);
        });
    }

    @Test
    public void testAppointmentDateNullException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("1234567890", null, "Ensure that appointment is working properly");
        });
    }

    @Test
    public void testAppointmentDateFormatException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Appointment appointment = new Appointment("1234567890", "2020/01/01 12:00", "Ensure that appointment is working properly");
        });
    }
}
