package StackOverflow.driver;

import StackOverflow.answer.Answer;
import StackOverflow.question.Question;
import StackOverflow.questionBoardManager.QuestionBoardManager;
import StackOverflow.user.User;

public class Main {
    public static void main(String[] args) {
        QuestionBoardManager questionBoardManager = new QuestionBoardManager();
        User user = new User("001", "Alicee", "alilo@gmail.com");
        Question question = questionBoardManager.createQuestion("Trial Question", "Who am I supposed to be",user );
        question.addAnswer(new Answer(user,"I am God's Favourite Child"));

        questionBoardManager.printQuestionBoard(question.getQuestionID());
    }
}
