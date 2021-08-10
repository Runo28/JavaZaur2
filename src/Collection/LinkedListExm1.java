package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExm1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ruslan");
        queue.add("Andrei");
        queue.add("Oleh");
        queue.add("Irina");
        queue.add("Natalia");
        System.out.println(queue);
        int a = queue.size();
        for (int i = 0; i <a ; i++) {
            queue.poll() ;
          if (queue.size()>0){
              queue.element();
          }
        }
        System.out.println(queue);

    }
}
