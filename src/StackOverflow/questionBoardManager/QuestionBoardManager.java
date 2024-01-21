package StackOverflow.questionBoardManager;

import StackOverflow.answer.Answer;
import StackOverflow.comment.Comment;
import StackOverflow.question.Question;
import StackOverflow.user.User;
import StackOverflow.vote.Vote;

import java.util.HashMap;
import java.util.Map;

public class QuestionBoardManager {
    private static Long NUMBER_OF_QUESTIONS = 0L;
    private Map<Long, Question> questionMap;

    public QuestionBoardManager() {
        questionMap = new HashMap<>();
    }

    public Question createQuestion(String title, String question, User user){
        Question newQuestion = new Question(NUMBER_OF_QUESTIONS,title, question, user);
        questionMap.put(NUMBER_OF_QUESTIONS, newQuestion);
        NUMBER_OF_QUESTIONS++;
        return newQuestion;
    }

    public Question getQuestionByID(Long id){
        return questionMap.get(id);
    }

    public void setAnswerToQuestion(Answer answer, Long ID) {
        Question question = questionMap.get(ID);
        question.addAnswer(answer);
    }

    public void setCommentToQuestion(Comment comment, Long ID) {
        Question question = questionMap.get(ID);
        question.addComment(comment);
    }

    public void setVoteToQuestion(Vote vote, Long ID) {
        Question question = questionMap.get(ID);
        question.addVote(vote);
    }

    public void printQuestionBoard(Long ID) {
        System.out.println(questionMap.get(ID).toString());
    }



}
