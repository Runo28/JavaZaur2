package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(8);list.add(1);list.add(-25);list.add(0);list.add(-35);list.add(11);list.add(-6);
        list.add(7);list.add(-5);list.add(13);list.add(4);list.add(-9);list.add(125);list.add(-37);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,-9));
    }
}
