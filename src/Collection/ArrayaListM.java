package Collection;

import java.util.Arrays;
import java.util.List;

public class ArrayaListM {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder [] arr1 = {sb1,sb2,sb3,sb4};
        String st1 = new String("a");
        String st2 = new String("b");
        String st3 = new String("c");
        String st4 = new String("d");
        String [] arr2 = {st1,st2,st3,st4};
        List<StringBuilder>list = Arrays.asList(arr1);
        System.out.println(list);
        arr1[0].append("!!");
        System.out.println(list);
        List<String> list2 = Arrays.asList(arr2);
        System.out.println(list2);
        arr2[1]=arr2[1]+"cd";
        System.out.println(list2);
        Integer []arr3 = {1,2,3,4};
        List<Integer>list3 = Arrays.asList(arr3);
        System.out.println(list3);
    }
}
