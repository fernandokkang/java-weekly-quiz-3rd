package weekly.service;

import java.util.Map;

public interface ManagementService {

    public void saveBusinessContact(Map<String, String> contact);
    public void savePersonalContact(Map<String, String> contact);
    public String getContactsInfo();
    public String getSearchContactsInfo(String name);
}
