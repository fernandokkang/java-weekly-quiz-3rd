package weekly.controller;

import weekly.service.ManagementService;
import weekly.util.Menu;
import weekly.view.InputView;
import weekly.view.OutputView;

import java.util.Map;
import java.util.Scanner;

public class ManagementController {

    private final InputView inputView;
    private final OutputView outputView;
    private final ManagementService managementService;

    public ManagementController(InputView inputView, OutputView outputView, ManagementService managementService) {

        this.inputView = inputView;
        this.outputView = outputView;
        this.managementService = managementService;
    }

    public void run() {

        try {
            Scanner sc = new Scanner(System.in);
            int input;

            do {
                inputView.printMenu();
                input = sc.nextInt();

                if (Menu.ADD_BUSINESS_CONTACT.getMenuNum() == input) {
                    addBusinessContact();
                }
                if (Menu.ADD_PERSONAL_CONTACT.getMenuNum() == input) {
                    addPersonalContact();
                }
                if (Menu.PRINT_CONTACTS.getMenuNum() == input) {
                    displayContacts();
                }
                if (Menu.SEARCH_CONTACTS.getMenuNum() == input) {
                    displaySearchContacts();
                }
            }while (Menu.EXIT.getMenuNum() != input);


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void addBusinessContact() {

        Map<String, String> contact = inputView.addBusinessContact();
        managementService.saveBusinessContact(contact);
    }

    private void addPersonalContact() {

        Map<String, String> contact = inputView.addPersonalContact();
        managementService.savePersonalContact(contact);
    }

    private void displayContacts() {
        outputView.displayContacts(managementService.getContactsInfo());
    }

    private void displaySearchContacts() {
        String name = inputView.searchContact();
        outputView.displaySearchContacts(managementService.getSearchContactsInfo(name));
    }
}
