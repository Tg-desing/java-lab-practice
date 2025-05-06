package week6;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Contact {
	private HashMap<String, String> contacts;

    public Contact() {
        contacts = new HashMap<>();
    }

    /**
     * Adds a new contact to the list.
     * If the name or phone number already exists, prints "error".
     *
     * @param name  the name of the contact
     * @param phone the phone number of the contact
     */
    public void add(String name, String phone)
    {
        if (contacts.containsKey(name) || contacts.containsValue(phone)) {
            System.out.println("error");
        } else {
            contacts.put(name, phone);
        }
    }

    /**
     * Deletes a contact by name.
     * If the name does not exist, prints "error".
     *
     * @param name the name of the contact to delete
     */
    public void delete(String name) {
        if (!contacts.containsKey(name)) {
            System.out.println("error");
        } else {
            contacts.remove(name);
        }
    }

    /**
     * Finds and prints the phone number of a contact.
     * If the name does not exist, prints "error".
     *
     * @param name the name of the contact to find
     */
    public void find(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(contacts.get(name));
        } else {
            System.out.println("error");
        }
    }

    /**
     * Displays all contacts in ascending order by name.
     * Prints each contact in the format: [name] [phone-number].
     */
    public void show() {
        ArrayList<String> names = new ArrayList<>(contacts.keySet());
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name + " " + contacts.get(name));
        }
    }
}
