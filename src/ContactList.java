import java.util.ArrayList;

public class ContactList {
    // Instance variable
    private ArrayList<Person> contacts;
    // Constructor (initializes arraylist)
    public ContactList() {
         contacts = new ArrayList<Person>();
    }

    // Getter
    public ArrayList<Person> getContacts() {
        return contacts;
    }

    // add person to list method
    public void addContact(Person contact) {
        contacts.add(contact);
    }
}
