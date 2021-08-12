import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }

    public static List<Course> uniqueCorsesByStudents(List<Student> listStudents) {
        return listStudents.stream().
                map(o -> o.getListOfCourses())
                .flatMap(o -> o.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Student> topThreeStudentsByCountOfCourses(List<Student> listStudents) {
        return listStudents.stream().sorted((s1, s2) -> s2.getListOfCourses().size() - s1.getListOfCourses().size())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Student> listOfStudentsByCourse(List<Student> listStudents, Course course) {
        return listStudents.stream()
                .filter(o -> o.getListOfCourses().contains(course))
                .collect(Collectors.toList());
    }
}
/*
Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.

Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных (любознательность
определяется количеством курсов).

Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают
этот курс.
*/