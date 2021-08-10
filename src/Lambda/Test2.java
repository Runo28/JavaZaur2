package Lambda;

public class Test2 {
    void def (I i){
        System.out.println(i.abc(9d));
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.def((Double i)-> {return (int) Math.sqrt(i);});
    }
}

interface I {
    int abc (Double d);
}
