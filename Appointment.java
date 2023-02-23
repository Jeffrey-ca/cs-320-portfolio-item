import java.util.Date;

public class Appointment {
    private String appointmentID;
    private String appointmentDate;
    private String appointmentDescription;

    public boolean isFutureDate(String appointmentDate) {
        Date date = new Date();
        String[] dateArray = appointmentDate.split("/");
        int month = Integer.parseInt(dateArray[0]);
        int day = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[2]);
        Date appointment = new Date(year, month, day);
        if (appointment.before(date)) {
            return true;
        } else {
            return false;
        }
    }

    public Appointment() {
        this.appointmentID = "";
        this.appointmentDate = "";
        this.appointmentDescription = "";
    }

    private Boolean lengthAndString(int length, String s) {
        if (s == null || s.length() > length) {
            return false;
        } else {
            return true;
        }
    }

    public Appointment(String appointmentID, String appointmentDate, String appointmentDescription) {
        if (!lengthAndString(10, appointmentID)) {
            throw new IllegalArgumentException("Appointment ID cannot be null or longer than 10 characters");
        }
        this.appointmentID = appointmentID;
        if (appointmentDate == null || isFutureDate(appointmentDate)) {
            throw new IllegalArgumentException("Appointment Date cannot be null or in the past");
        }
        this.appointmentDate = appointmentDate;
        if (!lengthAndString(50, appointmentDescription)) {
            throw new IllegalArgumentException("Appointment Description cannot be null or longer than 50 characters");
        }
        this.appointmentDescription = appointmentDescription;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        if (appointmentDate == null || isFutureDate(appointmentDate)) {
            throw new IllegalArgumentException("Appointment Date cannot be null or in the past");
        }
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        if (!lengthAndString(50, appointmentDescription)) {
            throw new IllegalArgumentException("Appointment Description cannot be null or longer than 50 characters");
        }
        this.appointmentDescription = appointmentDescription;
    }

    @Override
    public String toString() {
        return "Appointment{" + "appointmentID=" + appointmentID + ", appointmentDate=" + appointmentDate
                + ", appointmentDescription=" + appointmentDescription + '}';
    }

}