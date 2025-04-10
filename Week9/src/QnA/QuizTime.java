package QnA;

public class QuizTime {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.add(new Question("What is the capital of Nepal?", "Kathmandu"));
        quiz.add(new Question("2 + 2 equals?", "4"));
        quiz.add(new Question("What color is the sky on a clear day?", "Blue"));

        quiz.giveQuiz();
    }
}

