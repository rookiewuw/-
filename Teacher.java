import java.util.ArrayList;

public class Teacher {
   private String number;
    private String name;
    private ArrayList<Course> courses;
    Teacher(String number,String name,ArrayList<Course>courses){
        this.number=number;
        this.name=name;
        this.courses=courses;
    }
    public String getName(){
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void getCourses() {
        System.out.println(courses.toString());
    }
}
