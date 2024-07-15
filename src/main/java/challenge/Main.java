package challenge;

import java.util.List;

public class Main
{
    public static void main(String[] args) {
        //Students
        Student eva = new Student("14684", "Eva Goetzke", "Hamburg",1.7);
        Student luca = Student.builder()
                .id("32946")
                .name("Luca Klein")
                .address("Frankfurt")
                .grade(2.4)
                .build();
        Student pia = Student.builder()
                .id("12853")
                .name("Pia Baum")
                .address("Berlin")
                .grade(3.2)
                .build();

        // Teachers
        Teacher mathTeacher =  new Teacher("43491", "Elaine Novak", "Math");
        Teacher artsTeacher = Teacher.builder()
                .id("42380")
                .name("Carolina Moore")
                .subject("Art")
                .build();

        //Courses
        Course math101 = new Course("math-101", "Math 101", mathTeacher, List.of(eva, luca));
        Course math102 = Course.builder()
                .id("math-102")
                .name("Math 102")
                .teacher(mathTeacher)
                .students(List.of(pia))
                .build();
        Course art201 = Course.builder()
                .id("art-201")
                .name("Art 201")
                .teacher(artsTeacher)
                .students(List.of(luca, pia))
                .student(eva)
                .build();

        System.out.println(art201.getName()
                + " Students: " +
                art201.getStudents());
        System.out.println(math101.getTeacher().equals(math102.getTeacher()));
        System.out.println(math101.getTeacher().equals(art201.getTeacher()));
        art201.setStudents(List.of(eva, luca));
        System.out.println(art201);

        mathTeacher = mathTeacher.withName("Elaine Moore");
        math101.setTeacher(mathTeacher);
        System.out.println(math101);

        University hamburgUniversity = University.builder()
                .id("1")
                .name("Hamburg University")
                .course(math101)
                .course(math102)
                .build();

        University berlinUniversity = University.builder()
                .id("2")
                .name("Berlin University")
                .course(art201)
                .build();

        System.out.println(hamburgUniversity.name()
                + " Grade Average: " +
                UniversityService.calculateAverageByUniversity(hamburgUniversity));
        System.out.println(berlinUniversity.name()
                + " Grade Average: " +
                UniversityService.calculateAverageByUniversity(berlinUniversity));
        System.out.println(UniversityService.calculateAverageByCourse(math101));
        System.out.println(UniversityService.calculateAverageByCourse(art201));
        System.out.println(UniversityService.getStudentsWithGoodOrAboveAverage(hamburgUniversity));

    }
}
