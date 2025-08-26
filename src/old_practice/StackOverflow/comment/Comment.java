package old_practice.StackOverflow.comment;

import old_practice.StackOverflow.user.User;

public class Comment {
    private User user;
    private String comment;

    public Comment(User user) {
        this.user = user;
    }

    public Comment(User user, String comment) {
        this.user = user;
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "user=" + user +
                ",\n comment='" + comment + '\n' +
                '}';
    }
}
