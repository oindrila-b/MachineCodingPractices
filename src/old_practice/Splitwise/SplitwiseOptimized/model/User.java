package old_practice.Splitwise.SplitwiseOptimized.model;

public class User {

    private String userName;
    private String userID;
    private String email;
    private String phoneNumber;

    public User(String userName, String userID, String email, String phoneNumber) {
        this.userName = userName;
        this.userID = userID;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
