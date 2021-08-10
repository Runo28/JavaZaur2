package Lambda.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
    private static int pp = 0;
    private int id;

    public Student() {
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
        pp++;
        id = pp;
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

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student" + id + " {" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}

class Test {

    public void filtr (ArrayList<Student>list, Predicate<Student> p){
        for (Student s:list){
            if (p.test(s)){
                System.out.println(s.toString());
            }
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        Student st1 = new Student("Ruslan", 'm', 32, 4, 9.2);
        Student st2 = new Student("Zahar", 'm', 19, 1, 6.3);
        Student st3 = new Student("Irina", 'f', 34, 5, 8.1);
        Student st4 = new Student("Natalia", 'f', 25, 3, 7.4);
        Student st5 = new Student("Oksana", 'f', 26, 4, 6.8);
        Student st6 = new Student("Oleh", 'm', 21, 2, 8.5);
        Student st7 = new Student("Ihor", 'm', 30, 3, 7.9);
        Student st8 = new Student("Natasha", 'f', 28, 5, 9.1);
        Student st9 = new Student("Roman", 'm', 26, 4, 8.9);
        Student st10 = new Student("Karolina", 'f', 24, 2, 8.2);
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);
        listStudent.add(st6);
        listStudent.add(st7);
        listStudent.add(st8);
        listStudent.add(st9);
        listStudent.add(st10);
        System.out.println(listStudent);


        //лямда выражение
        Collections.sort(listStudent, (s1, s2) -> {
            if (s1.getCourse()==s2.getCourse()){
              return   s1.getName().compareTo(s2.getName());
            }
            else {
                return s1.getCourse()-s2.getCourse();
            }
        });
        System.out.println(listStudent);


        //Анонимный класс
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().charAt(o1.getName().length() - 1) - o2.getName().charAt(o2.getName().length() - 1);
            }
        });
        System.out.println(listStudent);

        t.filtr(listStudent,student -> {return student.getName().equals("Ruslan");});
        ArrayList<Student> list = new ArrayList<Student>(listStudent);
        list.removeIf(student -> {return student.getAge()<31;});
        System.out.println(list);



    }
}
