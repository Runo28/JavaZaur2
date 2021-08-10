package MnogoPotochnost.ThreadExm;

public class Test1 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();

    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <101 ; i++) {
            System.out.println(i+" ");
        }
    }


}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i + " ");
        }
    }
}
