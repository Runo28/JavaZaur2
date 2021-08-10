package Srteam.filterExm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ruslan",'m',32,5,9.2);
        Student st2 = new Student("Alina",'f',21,2,8.3);
        Student st3 = new Student("Oleh",'m',26,4,7.4);
        Student st4 = new Student("Karolina",'f',28,3,7.9);
        Student st5 = new Student("Zahar",'m',19,1,6.8);
        List<Student>list1 = new ArrayList<>();

       list1.add(st1);list1.add(st2);list1.add(st3);list1.add(st4);list1.add(st5);

   //    list1.stream().forEach(Print::pr1);
//        list1= list1.stream().filter(s ->s.getAge()>22&&s.getAvrGrade()>7).collect(Collectors.toList());
//        System.out.println(list1);

        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);

        System.out.println(myStream.filter(e->e.getAge()>27).collect(Collectors.toList()));
    }
}

class Print {
    static void pr1 (Student s){
        System.out.println(s.toString());
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avrGrade;

    public Student(String name, char sex, int age, int course, double avrGrade) {
        setName(name);
        setSex(sex);
        setAge(age);
        setCourse(course);
        setAvrGrade(avrGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    public void setAvrGrade(double avrGrade) {
        this.avrGrade = avrGrade;
    }
}
