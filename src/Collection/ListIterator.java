package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListIterator {
    public static void main(String[] args) {
        String s = "madam";
        LinkedList<Character> linkedList = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            linkedList.add(c);
        }
        Iterator<Character> iterator = linkedList.iterator();
        for (int i = 0; i < linkedList.size(); i++) {
            if (iterator.hasNext()){
                System.out.println(linkedList.get(i));
            }
        }
    }
}

