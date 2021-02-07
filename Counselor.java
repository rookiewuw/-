import java.util.ArrayList;

public class Counselor  extends Teacher implements Manage{
    private ArrayList<Student> students;
        public Counselor(String number, String name, ArrayList<Course> courses,
                         ArrayList<Student>students) {
            super(number, name, courses);
            this.students=students;
        }
        public String getsname(){
            return students.toString();
        }

}
