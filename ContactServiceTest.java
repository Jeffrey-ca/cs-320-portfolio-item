import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactServiceTest {
    @Test
    public void testContactService() {
        ContactService contactService = new ContactService();
        assertEquals(0, contactService.hashmapSize());
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("Success", contactService.addContact(contact));
        assertEquals(1, contactService.hashmapSize());
        assertEquals("Success", contactService.deleteContact("1234567890"));
        assertEquals(0, contactService.hashmapSize());
        assertEquals("Success", contactService.addContact(contact));
        assertEquals(1, contactService.hashmapSize());
        assertEquals("Success", contactService.updateContact(contact));
        assertEquals(1, contactService.hashmapSize());
    }

}