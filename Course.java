import java.util.ArrayList;
public class Course {
    private String name;
    private String teacher;
    private String place;
    private ArrayList<Student> student;
    Course(String name,String teacher,String place,ArrayList<Student>student){
        this.name=name;
        this.teacher=teacher;
        this.place=place;
        this.student=student;
    }
    public String getName() {
        return name;
    }
    public String getPlace() {
        return place;
    }
    public String getTeacher() {
        return teacher;
    }
    public ArrayList<Student> getStudent() {
        return student;
    }
    @Override
    public String toString() {
        return name+" "+teacher+" "+place+" "+student;
    }
}
