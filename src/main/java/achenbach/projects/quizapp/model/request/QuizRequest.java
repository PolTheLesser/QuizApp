package achenbach.projects.quizapp.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuizRequest {
    private String name;
    private String description;
    private ArrayList<String> categories;
    private ArrayList<QuestionRequest> questions;
}
