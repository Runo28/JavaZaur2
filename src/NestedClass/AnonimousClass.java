package NestedClass;

public class AnonimousClass {
    public static void main(String[] args) {
        Math suma = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }

        };
        Math umnoj = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(suma.doOperation(5,3));
        System.out.println(umnoj.doOperation(5,7));
    }
}

interface Math {
    int doOperation (int a,int b);
}
