package achenbach.projects.quizapp.model.request;

import achenbach.projects.quizapp.model.QuestionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequest {
    private String question;
    private QuestionType questionType;
    private ArrayList<AnswerRequest> answers;
}
