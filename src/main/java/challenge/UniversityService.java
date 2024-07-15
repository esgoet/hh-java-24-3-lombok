package challenge;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class UniversityService {

    public static double calculateAverageByCourse(Course course) {
        return course.getStudents().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElseThrow();
    }

    public static double calculateAverageByUniversity(University university) {
        return university.courses().stream()
                .mapToDouble(UniversityService::calculateAverageByCourse)
                .average()
                .orElseThrow();
    }

    public static List<Student> getStudentsWithGoodOrAboveAverage(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() <= 2.4)
                .toList();
    }

}
