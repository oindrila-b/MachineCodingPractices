package old_practice.Splitwise.SplitwiseSolution.model;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String userId;
    private String userName;
    private String userEmail;
    private Long phoneNumber;
    Map<String,Double> spenderIdAndOwedAmountMap;

    public User(String userId, String userName, String userEmail, Long phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.phoneNumber = phoneNumber;
        spenderIdAndOwedAmountMap = new HashMap<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Map<String, Double> getSpenderIdAndOwedAmountMap() {
        return spenderIdAndOwedAmountMap;
    }

    public void setSpenderIdAndOwedAmountMap(String key, Double value) {
        this.spenderIdAndOwedAmountMap.put(key,value);
    }
}
