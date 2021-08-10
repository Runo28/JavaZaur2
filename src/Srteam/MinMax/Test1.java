package Srteam.MinMax;

import Srteam.FlatMap.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int aMin = Arrays.stream(arr).min().getAsInt();
        int aMax = Arrays.stream(arr).max().getAsInt();
        System.out.println("min = "+aMin+" max = "+aMax);

        Student st1 = new Student("Ruslan",'m',32,3,9.2);
        Student st2 = new Student("Alina",'f',21,2,8.3);
        Student st3 = new Student("Oleh",'m',26,4,7.4);
        Student st4 = new Student("Karolina",'f',20,3,7.9);
        Student st5 = new Student("Zahar",'m',19,1,6.8);
        List<Student> list = new ArrayList<>();
        list.add(st1);list.add(st2);list.add(st3);list.add(st4);list.add(st5);

   //     Student min = list.stream().min((a,b)->a.getCourse()-b.getCourse()).get();
        System.out.println(list.stream().min((a,b)->a.getName().compareTo(b.getName())).get());
        System.out.println(list.stream().max((a,b)->a.getName().compareTo(b.getName())).get());
    }
}
