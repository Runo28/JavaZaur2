package Srteam.Sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(7);
        list1.add(1);
        list1.add(9);
        list1.add(-5);
        System.out.println(list1);

        List<Integer> list2=list1.stream().sorted().collect(Collectors.toList());
        list1=(ArrayList<Integer>) list2;
        System.out.println(list1);
        int []arr = {5,1,6,-2,8,-3,-7,5,9,-15};
        System.out.println(Arrays.toString(arr));
        arr= Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));

        Student st1 = new Student("Ruslan",'m',32,5,9.2);
        Student st2 = new Student("Alina",'f',21,2,8.3);
        Student st3 = new Student("Oleh",'m',26,4,7.4);
        Student st4 = new Student("Karolina",'f',20,3,7.9);
        Student st5 = new Student("Zahar",'m',19,1,6.8);
        List<Student>list = new ArrayList<>();

        list.add(st1);list.add(st2);list.add(st3);list.add(st4);list.add(st5);
        list.stream().map(e->{e.setName(e.getName().toUpperCase());return e;}).
                filter(e->e.getSex()=='f').sorted((a,b)->a.getAge()-b.getAge()).forEach(e-> System.out.println(e+" "));
//        System.out.println(list);
//        list=list.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(list);
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
