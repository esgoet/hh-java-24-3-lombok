package challenge;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    @Singular private List<Student> students;
}
