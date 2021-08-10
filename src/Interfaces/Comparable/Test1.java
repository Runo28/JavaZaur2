package Interfaces.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Ruslan");
        list.add("Roman");
        list.add("Ira");
        list.add("Kolia");
        System.out.println("До сортировки");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки");
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}
