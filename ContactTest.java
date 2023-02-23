import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ContactTest {
    @Test
    public void testContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("1234567890", contact.getContactID());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testSetFirstName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("Success", contact.setFirstName("Jane"));
        assertEquals("Jane", contact.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());
    }

    @Test
    public void testSetPhone() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    @Test
    public void testSetAddress() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contact.setAddress("456 Main St");
        assertEquals("456 Main St", contact.getAddress());
    }

    @Test
    public void testContactID() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("1234567890", contact.getContactID());
    }

    @Test
    public void testContactIDLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testFirstNameLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", "JohnDoeJohnDoe", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testLastNameLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", "John", "DoeDoeDoeDoeDoe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testPhoneLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", "John", "Doe", "123456789", "123 Main St");
        });
    }

    @Test
    public void testAddressLengthException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", "John", "Doe", "123456789",
                    "123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St123 Main St");
        });
    }

    @Test
    public void testContactIDNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testFirstNameNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", null, "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testLastNameNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", "John", null, "1234567890", "123 Main St");
        });
    }

    @Test
    public void testPhoneNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", "John", "Doe", null, "123 Main St");
        });
    }

    @Test
    public void testAddressNullException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", null);
        });
    }

}
