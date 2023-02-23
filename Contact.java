public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact() {
        this.contactID = "";
        this.firstName = "";
        this.lastName = "";
        this.phone = "";
        this.address = "";

    }

    private Boolean lengthAndString(int length, String s) {
        if (s == null || s.length() > length) {
            return false;
        } else {
            return true;
        }
    }

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        if (!lengthAndString(10, contactID)) {
            throw new IllegalArgumentException("Contact ID cannot be null or longer than 10 characters");
        }
        this.contactID = contactID;
        if (!lengthAndString(10, firstName)) {
            throw new IllegalArgumentException("First Name cannot be null or longer than 10 characters");
        }
        this.firstName = firstName;
        if (!lengthAndString(10, lastName)) {
            throw new IllegalArgumentException("Last Name cannot be null or longer than 10 characters");
        }
        this.lastName = lastName;
        if (phone == null || !(phone.length() == 10)) {
            throw new IllegalArgumentException("Phone number cannot be null or is not 10 digits");
        }
        this.phone = phone;
        if (!lengthAndString(30, address)) {
            throw new IllegalArgumentException("Address cannot be null or longer than 30 characters");
        }
        this.address = address;
    }

    public String getContactID() {
        return this.contactID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String setFirstName(String firstName) {
        if (!lengthAndString(10, firstName)) {
            throw new IllegalArgumentException("First Name cannot be null or longer than 10 characters");
        } else {
            this.firstName = firstName;
            return "Success";
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (!lengthAndString(10, lastName)) {
            throw new IllegalArgumentException("Last Name cannot be null or longer than 10 characters");
        } else {
            this.lastName = lastName;
        }
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        if (phone == null || !(phone.length() == 10)) {
            throw new IllegalArgumentException("Phone number cannot be null or is not 10 digits");
        } else {
            this.phone = phone;
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        if (!lengthAndString(30, address)) {
            throw new IllegalArgumentException("Address cannot be null or longer than 30 characters");
        } else {
            this.address = address;
        }
    }

    public String toString() {
        return "ContactID: " + contactID + "Name: " + this.firstName + " " + this.lastName + " Phone: " + this.phone
                + " Address: " + this.address;

    }
}