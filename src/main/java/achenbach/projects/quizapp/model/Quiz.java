package achenbach.projects.quizapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
    private long id;
    private String name;
    private String description;
    private ArrayList<String> categories;
    private ArrayList<Question> questions;
}
