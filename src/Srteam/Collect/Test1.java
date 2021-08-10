package Srteam.Collect;

import Srteam.FlatMap.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Srteam.FlatMap.Student.*;

public class Test1 {

    public static void main(String[] args) {
        Student st1 = new Student("Ruslan",'m',32,3,9.2);
        Student st2 = new Student("Alina",'f',21,2,8.3);
        Student st3 = new Student("Oleh",'m',26,4,7.4);
        Student st4 = new Student("Karolina",'f',20,3,7.9);
        Student st5 = new Student("Zahar",'m',19,1,6.8);
        List<Student> list = new ArrayList<>();

        list.add(st1);list.add(st2);list.add(st3);list.add(st4);list.add(st5);

        Map<Integer,List<Student>> mapStudent= list.stream().map(e->{e.setName(e.getName().toUpperCase());return e;}).
                collect(Collectors.groupingBy(e->e.getCourse()));
        System.out.println(list);

        Map<Boolean,List<Student>> mapStudent2=  list.stream().collect(Collectors.partitioningBy(student -> student.getSex()>'f'));
        System.out.println(mapStudent2.get(true));
        System.out.println(mapStudent2.get(false));

    }
}


