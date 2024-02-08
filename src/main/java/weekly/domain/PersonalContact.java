package weekly.domain;

import java.util.Map;

public class PersonalContact extends Contact{

    private String relationship;

    public PersonalContact(Map<String, String> contact) {
        super(contact.get("이름"), contact.get("전화번호"));
        this.relationship = contact.get("관계");
    }

    public String getContactInfo() {

        StringBuilder builder = new StringBuilder();

        builder.append(super.getContactInfo())
                .append("관계: ").append(relationship).append("\n");

        return builder.toString();
    }
}
