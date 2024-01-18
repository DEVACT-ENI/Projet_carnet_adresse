import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarnetContacts {
    private static CarnetContacts instance;
    private Map<Integer, Contact> contacts = new HashMap();
    private int iterator = 0;

    private CarnetContacts() {

    }

    public static CarnetContacts getInstance() {
        if (instance == null)
            instance = new CarnetContacts();
        return instance;
    }

    public void addList(List<Contact> listContact) {
        listContact.forEach(contact -> {
            addElement(contact);
        });
    }

    public void addElement(Contact contact) {
        contacts.put(iterator++, contact);
    }

    public void delete(int i) {
        contacts.remove(i);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("CarnetContacts{\n");
        contacts.values().forEach(valeur -> {
            str.append(valeur);
        });
        str.append("'}'");
        return str.toString();
    }
}
