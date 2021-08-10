package Lambda;

import Collection.ArrayaListM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Predicate;

public class Student implements Comparable<Student>{
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


    @Override
    public int compareTo(Student o) {
        if (course-o.course==0){
            return name.compareTo(name);
        } else
        return course-o.course;
    }
}

class Test extends Student {


    void sortStodent(ArrayList<Student> list, Predicate<Student> p) {
        for (Student s : list) {
            if (p.test(s)) {
                System.out.println(s.toString());
            }
        }
    }

    ArrayList<Student> sortStud(ArrayList<Student> list, Predicate<Student> p) {
        ArrayList<Student> AL = new ArrayList<>();
        for (Student s : list) {
            if (p.test(s)) {
                AL.add(s);
            }
        }
        return AL;
    }

    ArrayList<Student>sortPoPolu (ArrayList<Student>list, char c){
       return sortStud(list,student -> {return student.getSex()==c;});
    }

    ArrayList<Student>sortPoVozrastBolshe (ArrayList<Student>list, int a){
        return sortStud(list,student -> {return student.getAge()>a;});
    }

    void sortirovka (ArrayList<Student> list, Predicate<Student> p ){
        for (Student s:list){
          if  (p.test(s)){
                System.out.println(s);
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

//        t.sortStodent(listStudent, student -> {return student.getAge() > 29;});
//        ArrayList<Student> ALSort = new ArrayList<>(t.sortStud(listStudent, student -> {return student.getCourse()==4;}));
//        System.out.println(ALSort);
//
//        System.out.println(t.sortPoPolu(listStudent,'m'));
//        System.out.println(t.sortPoVozrastBolshe(listStudent,30));
//        Collections.sort(listStudent);
//        System.out.println(listStudent);
      Collections.sort(listStudent, (stud1,stud2) ->{if (stud1.getAge()-stud2.getAge()==0){
         return stud1.getName().compareTo(stud2.getName());
      }
      else return stud1.getAge()-stud2.getAge();});
        for (Student s:listStudent){
            System.out.println(s);
        }

    }
}

