package achenbach.projects.quizapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer {
    private long id;
    private String answerText;
    private Boolean isCorrect;
}
