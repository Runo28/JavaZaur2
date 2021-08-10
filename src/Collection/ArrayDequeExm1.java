package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExm1 {
    public static void main(String[] args) {
        Deque <Integer>ad1 =new ArrayDeque<>();
        ad1.addFirst(5);
        ad1.addFirst(3);
        ad1.addLast(1);
        ad1.offerFirst(7);
        ad1.offerLast(2);
        System.out.println(ad1);
    }
}
