import java.util.HashMap;

public class ContactService extends Contact {

    private HashMap<String, Contact> contacts = new HashMap<>();

    public String addContact(Contact contact) {
        String contactID = contact.getContactID();
        if (contacts.containsKey(contactID)) {
            return "Contact ID already exists";
        } else {
            contacts.put(contactID, contact);
            return "Success";
        }
    }

    public String deleteContact(String contactID) {
        if (contacts.containsKey(contactID)) {
            contacts.remove(contactID);
            return "Success";
        } else {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
    }

    public String updateContact(Contact contact) {
        String contactID = contact.getContactID();
        if (contacts.containsKey(contactID)) {
            contacts.put(contactID, contact);
            return "Success";
        } else {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
    }

    public int hashmapSize() {
        return contacts.size();
    }

    public HashMap<String, Contact> getContacts() {
        return contacts;
    }

}