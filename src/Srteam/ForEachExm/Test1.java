package Srteam.ForEachExm;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int [] arr = {5,9,3,8,1};
        Arrays.stream(arr).forEach(value -> {value*=value;
            System.out.print(value+" ");});
        System.out.println();
//        Arrays.stream(arr).forEach(System.out::print);
        Arrays.stream(arr).forEach(Print::print2);
    }
}

class Print {
    static void print1 (int a){
        System.out.print(a+" ");
    }

    static void print2 (int a){
        a+=a;
        System.out.print(a+" ");
    }

    static void print3 (int a){
        a*=a;
        System.out.print(a+" ");
    }

}
