package Srteam.FindFirst;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).filter(value -> value%2==0).findFirst());
    }
}
