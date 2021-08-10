package Srteam.Skip;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        int[] arr2 = Arrays.stream(arr).skip(3).toArray();
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.stream(arr).limit(5).toArray();
        int[] arr4 = Arrays.stream(arr).skip(5).toArray();
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }
}
