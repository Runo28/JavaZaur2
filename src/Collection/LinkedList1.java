package Collection;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        Student st1 = new Student("Ruslan",5);
        Student st2 = new Student("Ira",3);
        Student st3 = new Student("Ivan",2);
        Student st4 = new Student("Natasha",2);
        Student st5 = new Student("Ruslan",5);
        linkedList.add("privet");
        linkedList.add("poka");
        linkedList.add("ok");
        LinkedList<Student> linkedList2 = new LinkedList<>();
        linkedList2.add(st1);linkedList2.add(st2);linkedList2.add(st3);linkedList2.add(st4);
        System.out.println(linkedList2.get(2));
        System.out.println(st1.hashCode());
        System.out.println(st5.hashCode());
        System.out.println(st1.equals(st5));
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
