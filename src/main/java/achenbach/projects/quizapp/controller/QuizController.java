package achenbach.projects.quizapp.controller;

import achenbach.projects.quizapp.model.Quiz;
import achenbach.projects.quizapp.model.request.QuizRequest;
import achenbach.projects.quizapp.service.CreateQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    CreateQuizService createQuizService;

    @Autowired
    public QuizController(CreateQuizService createQuizService) {
        this.createQuizService = createQuizService;
    }

    @PostMapping("/create")
    public ResponseEntity<Quiz> createQuiz(@RequestBody QuizRequest quizRequest) {
        Quiz savedQuiz = createQuizService.createQuiz(quizRequest);
        return ResponseEntity.ok().body(savedQuiz);
    }
}
