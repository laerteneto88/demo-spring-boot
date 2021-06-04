package api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dummyStudent1 = new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, JANUARY, 5));

            Student dummyStudent2 = new Student(
                    "Marcela",
                    "marcela@gmail.com",
                    LocalDate.of(1997, AUGUST, 22));

            repository.saveAll(List.of(dummyStudent1, dummyStudent2));
        };
    }
}
