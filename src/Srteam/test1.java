package Srteam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        List<String> list1 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        List<Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list4 = new ArrayList<>();
        for (String s : list) {
            list4.add(s.length());
        }
        System.out.println(list4);

        int[] arr2 = Arrays.stream(arr).map(s -> s * s).toArray();
        int[] arr3 = Arrays.stream(arr).map(a -> a * 3).map(a -> a - 2).map(a -> a * a).toArray();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int a : arr3) {
            list3.add(a);
        }
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.stream(arr).map(s
                        -> {
                    if (s % 3 == 0) {
                        s = s * s * s;
                    }
                    if (s%2==0){
                        s=0;
                    }
                    return s;
                }
        ).toArray();
        System.out.println(Arrays.toString(arr4));

        Set<Integer> set = list2.stream().map(a-> a).collect(Collectors.toSet());
        System.out.println(set);


    }
}

