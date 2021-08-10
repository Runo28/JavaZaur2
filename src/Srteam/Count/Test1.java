package Srteam.Count;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,1,2,3};
        long l1 = Arrays.stream(arr).count();
        System.out.println(l1);
        Stream<Integer> l2 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(l2.count());
        Stream<Integer> l3 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(l3.distinct().count());

    }
}
