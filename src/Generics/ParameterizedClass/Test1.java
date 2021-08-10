package Generics.ParameterizedClass;

public class Test1 {
    public static void main(String[] args) {
        Info<String,Integer>car1 = new Info<>("red","V6",4);
        Info<String,Integer>car2 = new Info<>("bleak","V5",3);
        System.out.println(car1.toString());
        car1.setValue1("blue");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        car2.setValue3(2);
        System.out.println(car2.toString());
    }
}

class Info <T1,T2>{
    private T1 value1;
    private T1 value2;
    private T2 value3;

    public Info(T1 value1, T1 value2, T2 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }

    public void setValue2(T1 value2) {
        this.value2 = value2;
    }

    public void setValue3(T2 value3) {
        this.value3 = value3;
    }

    public T1 getValue1() {
        return value1;
    }

    public T1 getValue2() {
        return value2;
    }

    public T2 getValue3() {
        return value3;
    }

    public String toString (){
        return "color: " + value1 + ", engine: " + value2+ ", dver: "+ value3+ ".";
    }
}
