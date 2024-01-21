package StackOverflow.vote;

import StackOverflow.user.User;

public class Vote {
    private User user;
    private boolean upVote;
    private boolean downVote;

    public Vote(User user) {
        this.user = user;
        upVote = false;
        downVote = false;
    }

    public User getUser() {
        return user;
    }

    public boolean isUpVote() {
        return upVote;
    }

    public boolean isDownVote() {
        return downVote;
    }

    public void doUpVote() {
        this.upVote = true;
    }

    public void doDownVote() {
        this.downVote = true;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "user=" + user +
                ",\n upVote=" + upVote +
                ",\n downVote=" + downVote +
                '}';
    }
}
