package weekly.view;

import weekly.constant.Message;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputView {

    public void printMenu() {

        StringBuilder builder = new StringBuilder();
        builder.append(Message.INPUT_MENU1)
                .append(Message.INPUT_MENU2)
                .append(Message.INPUT_MENU3)
                .append(Message.INPUT_MENU4)
                .append(Message.INPUT_MENU5)
                .append(Message.INPUT_MENU_CHOICE);

        System.out.print(builder);
    }

    private Map<String, String> addContact() {
       Map<String, String> contact = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print(Message.ENTER_NAME);
        String name = sc.next();
        contact.put("이름", name);

        System.out.print(Message.ENTER_PHONE_NUMBER);
        String phoneNum = sc.next();
        contact.put("전화번호", phoneNum);

       return contact;
    }

    public Map<String, String> addBusinessContact() {

        Map<String, String> contact = addContact();

        Scanner sc = new Scanner(System.in);

        System.out.print(Message.ENTER_COMPANY_NAME);
        String companyName = sc.next();
        contact.put("회사명", companyName);

        return contact;
    }

    public Map<String, String> addPersonalContact() {

        Map<String, String> contact = addContact();

        Scanner sc = new Scanner(System.in);

        System.out.print(Message.ENTER_RELATIONSHIP);
        String relationship = sc.next();
        contact.put("관계", relationship);

        return contact;
    }

    public String searchContact() {

        Scanner sc = new Scanner(System.in);

        System.out.print(Message.SEARCH_CONTACT);

        return sc.next();
    }
}
