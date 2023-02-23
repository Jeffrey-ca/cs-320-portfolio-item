import java.util.HashMap;

public class AppointmentService {

    private HashMap<String, Appointment> appointments = new HashMap<>();

    public String addAppointment(Appointment appointment) {
        String appointmentID = appointment.getAppointmentID();
        if (appointments.containsKey(appointmentID)) {
            throw new IllegalArgumentException("Appointment ID already exists");
        } else {
            appointments.put(appointmentID, appointment);
            return "Success";

        }
    }

    public String deleteAppointment(String appointmentID) {
        if (appointments.containsKey(appointmentID)) {
            appointments.remove(appointmentID);
            return "Success";
        } else {
            throw new IllegalArgumentException("Appointment ID does not exist");
        }
    }

    public int hashmapSize() {
        return appointments.size();
    }

    public HashMap<String, Appointment> getAppointments() {
        return appointments;
    }
}
