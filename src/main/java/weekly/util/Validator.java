package weekly.util;

import weekly.constant.ErrorMessage;
public class Validator {

    public static void validate(String phoneNum) {

        String REGEX = "^\\d{2,3}-\\d{3,4}-\\d{4}$";

        if(!phoneNum.matches(REGEX)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_PHONE_NUMBER);
        }
    }
}
