package old_practice.StackOverflow.driver;

import old_practice.StackOverflow.answer.Answer;
import old_practice.StackOverflow.question.Question;
import old_practice.StackOverflow.questionBoardManager.QuestionBoardManager;
import old_practice.StackOverflow.user.User;

public class Main {
    public static void main(String[] args) {
        QuestionBoardManager questionBoardManager = new QuestionBoardManager();
        User user = new User("001", "Alicee", "alilo@gmail.com");
        Question question = questionBoardManager.createQuestion("Trial Question", "Who am I supposed to be",user );
        question.addAnswer(new Answer(user,"I am God's Favourite Child"));

        questionBoardManager.printQuestionBoard(question.getQuestionID());
    }
}
