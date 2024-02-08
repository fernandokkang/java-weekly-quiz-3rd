package weekly.service;

import weekly.domain.AddressBook;
import weekly.domain.BusinessContact;
import weekly.domain.PersonalContact;

import java.util.Map;

public class ManagementServiceImpl implements ManagementService{

    private final AddressBook addressBook = new AddressBook();

    @Override
    public void saveBusinessContact(Map<String, String> contact) {

        BusinessContact businessContact =
                new BusinessContact(contact);

        addressBook.addContacts(businessContact);
    }

    @Override
    public void savePersonalContact(Map<String, String> contact) {

        PersonalContact personalContact =
                new PersonalContact(contact);

        addressBook.addContacts(personalContact);
    }

    @Override
    public String getContactsInfo() {

        return addressBook.getContactsInfo();
    }

    @Override
    public String getSearchContactsInfo(String name) {
        return addressBook.searchContacts(name);
    }

}
