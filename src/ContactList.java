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

    // For each loop to print each person
    public void printContacts()
    {
        for(Person a: contacts)
        {
            System.out.println(a);
        }
    }

    public void sortByFirstName()
    {
        // Variables
        Person temp;
        String n1;
        String n2;

        // nested forloop
        for(int i = 0; i < contacts.size() - 1; i++)
        {
            for (int j = 0; j < contacts.size() - 1 - i; j++)
            {
                // Initializes variables
                n1 = contacts.get(j).getFirstName();
                n2 = contacts.get(j+1).getFirstName();
                // Compares two names
                if(n1.compareTo(n2) > 0)
                {
                    // Switches person with person next to them
                    temp = contacts.get(j);
                    contacts.set(j,contacts.get(j+1));
                    contacts.set(j+1, temp);
                }
            }
        }
    }
    public void sortByLastName()
    {
        // Variables
        Person temp;
        String n1;
        String n2;
        // Nested loop
        for(int i = 0; i < contacts.size() - 1; i++)
        {
            for (int j = 0; j < contacts.size() - 1 - i; j++)
            {
                // Initialize variables
                n1 = contacts.get(j).getLastName();
                n2 = contacts.get(j+1).getLastName();
                // Compare strings to see order
                if(n1.compareTo(n2) > 0)
                {
                    // Switch mechanism
                    temp = contacts.get(j);
                    contacts.set(j,contacts.get(j+1));
                    contacts.set(j+1, temp);
                }
            }
        }
    }
    public void sortByPhoneNumber()
    {
        // Variables
        Person temp;
        String num1;
        String num2;
        // Nested Loop
        for(int i = 0; i < contacts.size() - 1; i++)
        {
            for (int j = 0; j < contacts.size() - 1 - i; j++)
            {
                num1 = contacts.get(j).getPhoneNumber();
                num2 = contacts.get(j+1).getPhoneNumber();
                // Compare strings to see order
                if(num1.compareTo(num2) > 0)
                {
                    // Switch
                    temp = contacts.get(j);
                    contacts.set(j,contacts.get(j+1));
                    contacts.set(j+1, temp);
                }
            }
        }
    }

    public Person searchByFirstName(String f)
    {
        for(Person a: contacts)
        {
            if(a.getFirstName() == f)
            {
                return a;
            }
        }
        return null;
    }
    public Person searchByLastName(String l)
    {
        // Goes through contact list and checks if there is a match
        for(Person a: contacts)
        {
            if(a.getLastName() == l)
            {
                return a;
            }
        }
        return null;
    }
    public Person searchByPhoneNumber(String num)
    {
        // Goes through contact list and checks if there is a match
        for(Person a: contacts)
        {
            if(a.getPhoneNumber() == num)
            {
                return a;
            }
        }
        return null;
    }



}
