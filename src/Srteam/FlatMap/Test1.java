package Srteam.FlatMap;



import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ruslan",'m',32,5,9.2);
        Student st2 = new Student("Alina",'f',21,2,8.3);
        Student st3 = new Student("Oleh",'m',26,4,7.4);
        Student st4 = new Student("Karolina",'f',20,3,7.9);
        Student st5 = new Student("Zahar",'m',19,1,6.8);
        List<Student> list = new ArrayList<>();

        list.add(st1);list.add(st2);list.add(st3);list.add(st4);list.add(st5);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("History");

        f1.addStudentOnFaculty(st1);
        f1.addStudentOnFaculty(st2);
        f1.addStudentOnFaculty(st3);
        f2.addStudentOnFaculty(st4);
        f2.addStudentOnFaculty(st5);

        List <Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentOnFaculty().stream()).
//                sorted((a,b)->{
//                    return a.getName().compareTo(b.getName());
//                }).
                forEach(s-> System.out.println(s.getName()));



    }
}


 class Faculty {
    String name;
    List <Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public void addStudentOnFaculty (Student s){
        studentOnFaculty.add(s);
    }

    public String getName() {
        return name;
    }
}

