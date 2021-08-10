package Srteam.SumAverage;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int [] arr = {1,2,8,-5,12,-15,-3,3,4,5};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
        System.out.println(Arrays.stream(arr).average());
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("min = "+ min+" max = "+max);


    }
}
