package MnogoPotochnost.ThreadExm;

public class test5 {
    public static void main(String[] args) {
        new Thread(new MyThread5()).start();

    }
}

class MyThread5 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            System.out.println(i);
        }
    }
}