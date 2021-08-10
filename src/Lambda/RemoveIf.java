package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);  list.add(8);  list.add(1);  list.add(13);  list.add(4);
        System.out.println(list);
        Collections.sort(list,(s1,s2)-> {return s1-s2;});
        System.out.println(list);
//        list.removeIf(s -> {return s%2==1;});
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };
        Predicate<Integer> predicate = integer -> {return integer%2==1;};
        list.removeIf(predicate);
        System.out.println(list);
    }
}
