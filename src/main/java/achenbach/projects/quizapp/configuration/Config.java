package achenbach.projects.quizapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "achenbach.projects.quizapp.repository")
public class Config {
}
