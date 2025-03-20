package achenbach.projects.quizapp.repository;

import achenbach.projects.quizapp.model.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface QuizRepository extends CrudRepository<Quiz, Long> {
    Quiz save(Quiz quiz);
}
