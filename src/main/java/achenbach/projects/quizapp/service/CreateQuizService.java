package achenbach.projects.quizapp.service;

import achenbach.projects.quizapp.model.Answer;
import achenbach.projects.quizapp.model.Question;
import achenbach.projects.quizapp.model.Quiz;
import achenbach.projects.quizapp.model.request.AnswerRequest;
import achenbach.projects.quizapp.model.request.QuestionRequest;
import achenbach.projects.quizapp.model.request.QuizRequest;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CreateQuizService {

    Repository quizRepository;

    CreateQuizService(Repository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public Quiz createQuiz(QuizRequest request) {
        Quiz quiz = new Quiz();
        quiz.setName(request.getName());
        quiz.setDescription(request.getDescription());
        quiz.setCategories(request.getCategories());

        ArrayList<Question> questions = new ArrayList<>();
        for (QuestionRequest questionRequest : request.getQuestions()) {
            Question question = new Question();
            question.setQuestion(questionRequest.getQuestion());
            question.setQuestionType(questionRequest.getQuestionType());
            if (questionRequest.getAnswers() != null) {
                ArrayList<Answer> answers = new ArrayList<>();
                for (AnswerRequest answerRequest : questionRequest.getAnswers()) {
                    Answer answer = new Answer();
                    answer.setAnswerText(answerRequest.getAnswerText());
                    answer.setIsCorrect(answerRequest.getIsCorrect());
                    answers.add(answer);
                }
                question.setAnswers(answers);
            }
            questions.add(question);
        }
        quiz.setQuestions(questions);

        return quiz;
    }
}
