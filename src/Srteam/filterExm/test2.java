package Srteam.filterExm;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {

        Arrays.asList(0, 2, 1, 3)
                .stream()
                .filter(n -> n > 0)
                .map(n -> String.valueOf(n * n))
                .sorted()
                .forEach(System.out::print);
    }
}
