package achenbach.projects.quizapp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Question {
    private long id;
    private String question;
    private QuestionType questionType;
    private ArrayList<Answer> answers;
}
