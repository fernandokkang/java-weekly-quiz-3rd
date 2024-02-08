package weekly.domain;

import weekly.constant.Message;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContacts(Contact contact) {

        contacts.add(contact);
    }

    public String getContactsInfo() {

        StringBuilder builder = new StringBuilder();

        for(Contact contact : contacts) {
            builder.append(contact.getContactInfo());
        }

        if(builder.isEmpty()) {
            builder.append(Message.EMPTY_ADDRESS_BOOK).append("\n");
        }

        return builder.toString();
    }

    public String searchContacts(String name) {

        StringBuilder builder = new StringBuilder();

        for(Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                builder.append(contact.getContactInfo());
            }
        }

        if(builder.isEmpty()) {
            builder.append(Message.CAN_NOT_FIND_CONTACT).append("\n");
        }

        return builder.toString();
    }
}
