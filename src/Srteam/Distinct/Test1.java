package Srteam.Distinct;

import Collection.ArrayaListM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Stream <Integer> stream = Stream.of(1,2,3,4,5,1,2,3);
        List<Integer> a1= stream.distinct().collect(Collectors.toList());
        String [] arr = {"privet","poka","ok","privet"};
        Arrays.stream(arr).distinct().toArray();
        System.out.println( Arrays.toString(Arrays.stream(arr).distinct().toArray()));

    }
}
