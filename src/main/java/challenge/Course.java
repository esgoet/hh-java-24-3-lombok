package challenge;

import lombok.*;
import lombok.experimental.NonFinal;

import java.util.List;

@Data
@Builder
@Value public class Course {
    String id;
    String name;
    @NonFinal Teacher teacher;
    @NonFinal @Singular List<Student> students;
}
