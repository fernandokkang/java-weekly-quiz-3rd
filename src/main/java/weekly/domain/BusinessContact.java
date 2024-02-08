package weekly.domain;

import java.util.Map;

public class BusinessContact extends Contact{

    private String companyName;

    public BusinessContact(Map<String, String> contact) {

        super(contact.get("이름"), contact.get("전화번호"));

        this.companyName = contact.get("회사명");
    }

    public String getContactInfo() {

        StringBuilder builder = new StringBuilder();

        builder.append(super.getContactInfo())
            .append("회사명: ").append(companyName).append("\n");

        return builder.toString();
    }
}
