package weekly.domain;

import weekly.util.Validator;

public class Contact {

    private String name;
    private String phoneNum;

    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;

        Validator.validate(phoneNum);
    }

    public String getContactInfo() {

        StringBuilder builder = new StringBuilder();

        builder.append("이름: ").append(name).append(", ")
                .append("전화번호: ").append(phoneNum).append(", ");

        return builder.toString();
    }

    public String getName() {
        return name;
    }
}
