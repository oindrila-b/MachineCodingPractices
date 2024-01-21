package StackOverflow.user;

import StackOverflow.question.Question;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;
    private String userName;
    private String userEmail;


    public User(String userID, String userName, String userEmail) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
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


    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\n' +
                ", userName='" + userName + '\n' +
                ", userEmail='" + userEmail + '\n' +
                '}';
    }
}
