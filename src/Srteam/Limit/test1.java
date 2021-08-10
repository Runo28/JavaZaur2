package Srteam.Limit;

import Srteam.FlatMap.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.stream(arr).limit(3).toArray();
        System.out.println(Arrays.toString(arr2));

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

        List<Student> list2 = list.stream().sorted((a, b) ->
        {
            return a.getName().compareTo(b.getName());
        }).
                filter(e -> e.getSex() == 'm').limit(2).collect(Collectors.toList());
        System.out.println(list2);
    }
}
