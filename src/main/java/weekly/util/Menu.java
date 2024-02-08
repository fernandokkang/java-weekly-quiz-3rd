package weekly.util;

public enum Menu {

    ADD_BUSINESS_CONTACT(1),
    ADD_PERSONAL_CONTACT(2),
    PRINT_CONTACTS(3),
    SEARCH_CONTACTS(4),
    EXIT(5);

    private final int menuNum;
    Menu(int menuNum) {
        this.menuNum = menuNum;
    }

    public int getMenuNum() {
        return menuNum;
    }
}
