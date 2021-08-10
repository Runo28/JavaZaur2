package Srteam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        Stream<Integer> s1 = Stream.of(1,2,3,4,5);
        Stream<Integer> s2 = Stream.of(6,7,8,9,10);
        Stream<Integer> s3 = Stream.concat(s1,s2);
        List<Integer> l = s3.collect(Collectors.toList());
        System.out.println(l);
        int [] arr3 = new int[l.size()];
        for (int i = 0; i <l.size() ; i++) {
            arr3[i]=l.get(i);
        }
        Arrays.stream(arr3).forEach(e -> System.out.print(e+" "));
    }
}
