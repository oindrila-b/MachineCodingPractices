package Splitwise.SpliwiseOptimizationPart2.model;

public class User {
    private String userID;
    private String userName;
    private String userEmail;
    private String phoneNumber;

    public User(String userID, String userName, String userEmail, String phoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.phoneNumber = phoneNumber;
    }



    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
