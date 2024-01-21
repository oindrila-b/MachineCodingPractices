package StackOverflow.question;

import StackOverflow.answer.Answer;
import StackOverflow.comment.Comment;
import StackOverflow.user.User;
import StackOverflow.vote.Vote;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private Long questionID;
    private String title;
    private String question;
    private User askingUser;

    private List<Answer> answersList;

    private List<Comment> comments;
    List<Vote> voteList;

    public Question(Long questionID,String title, String question, User askingUser) {
        this.questionID = questionID;
        this.title = title;
        this.question = question;
        this.askingUser = askingUser;
        this.comments = new ArrayList<>();
        this.voteList = new ArrayList<>();
        this.answersList = new ArrayList<>();
    }


    public void addAnswer(Answer answer) {
        this.answersList.add(answer);
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void addVote(Vote vote) {
        this.voteList.add(vote);
    }

    public void setQuestionID(Long questionID) {
        this.questionID = questionID;
    }

    public Long getQuestionID() {
        return questionID;
    }

    @Override
    public String toString() {
        return "Question { " +
                "questionID=" + questionID +
                ", \n title='" + title +
                ", \n question='" + question +
                ", \n askingUser=" + askingUser +
                ", \n answersList=" + answersList +
                ", \n comments=" + comments +
                ", \n voteList=" + voteList +
                " }";
    }
}
