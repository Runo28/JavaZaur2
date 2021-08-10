package MnogoPotochnost.ThreadExm;

public class Test3 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <101 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.start();
        for (int i = 100; i >0 ; i--) {
            System.out.println(i);
        }
    }
}
