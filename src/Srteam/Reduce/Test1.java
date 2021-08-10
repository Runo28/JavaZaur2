package Srteam.Reduce;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int [] arr = {5,8,9,3};
       int a = Arrays.stream(arr).reduce((s,ar)->s+ar).getAsInt();
//        System.out.println(a);

        ArrayList<String>list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        String s = list.stream().reduce("",(acum,b)->acum+" "+b.toUpperCase());
        System.out.println(s);
    }
}
