import java.util.List;

public class Student {
    private String name;
    private List<Course> listOfCourses;

    public Student(String name, List<Course> listOfCourses) {
        this.name = name;
        this.listOfCourses = listOfCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(List<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", listOfCourses=" + listOfCourses +
                '}';
    }
}
