import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
        Student a=new Student("1111","a","sj");
        Student b=new Student("2222","b","sj");
        ArrayList s=new ArrayList();
        s.add(a);
        s.add(b);
        ArrayList l=new ArrayList();
        System.out.println(a.toString());
        Course java=new Course("java","玛卡巴卡","home",s);
        Course ccc=new Course("c++","阿巴阿巴","205",s);
        l.add(java);
        l.add(ccc);
        System.out.println(l.toString());
        Teacher m=new Teacher("3333","华农",l);
        Teacher n=new Teacher("4444","罗翔",l);
        System.out.println(m.getNumber()+" "+m.getName());
        m.getCourses();
        Counselor fdy=new Counselor("5555","y",l,s);
        System.out.println(fdy.getNumber()+" "+fdy.getName()+" "+fdy.getsname());
    }
}
