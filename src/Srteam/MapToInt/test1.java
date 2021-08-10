package Srteam.MapToInt;

import Srteam.FlatMap.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ruslan", 'm', 32, 3, 9.2);
        Student st2 = new Student("Alina", 'f', 21, 2, 8.3);
        Student st3 = new Student("Oleh", 'm', 26, 4, 7.4);
        Student st4 = new Student("Karolina", 'f', 20, 3, 7.9);
        Student st5 = new Student("Zahar", 'm', 19, 1, 6.8);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        int []arr = list.stream().mapToInt(e->e.getCourse()).toArray();
        System.out.println(Arrays.toString(arr));

        List<Integer> list1 = list.stream().mapToInt(e->e.getAge()).boxed().collect(Collectors.toList());
        List<Double> list2 = list.stream().mapToDouble(e->e.getAvrGrade()).boxed().collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);
    }
}
