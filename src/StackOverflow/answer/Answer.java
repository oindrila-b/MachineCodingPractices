package StackOverflow.answer;

import StackOverflow.comment.Comment;
import StackOverflow.user.User;
import StackOverflow.vote.Vote;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private User responder;
    private String answer;
    private List<Comment> comments;
    private List<Vote> voteList;

    public Answer(User responder, String answer) {
        this.responder = responder;
        this.answer = answer;
        this.comments = new ArrayList<>();
        this.voteList = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void doVote(Vote vote){
        voteList.add(vote);
    }

    @Override
    public String toString() {
        return "Answer{" +
                "responder=" + responder +
                ", answer='" + answer + '\'' +
                ", comments=" + comments +
                ", voteList=" + voteList +
                '}';
    }
}
