package Generics.ParameterizedMethod;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
     ArrayList<String> al1 = new ArrayList<>();
     al1.add("privet");
     al1.add("poka");
     al1.add("ok");
        System.out.println(GetMethod.getSekondElement(al1));
    }
}

class Info <T1,T2> {
    private T1 value1;
    private T1 value2;
    private T2 value3;

    public Info(T1 value1, T1 value2, T2 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }

    public T1 getValue2() {
        return value2;
    }

    public void setValue2(T1 value2) {
        this.value2 = value2;
    }

    public T2 getValue3() {
        return value3;
    }

    public void setValue3(T2 value3) {
        this.value3 = value3;
    }


}

class GetMethod {
    public static <T> T getSekondElement (ArrayList<T> AL){
        return AL.get(1);
    }
}
