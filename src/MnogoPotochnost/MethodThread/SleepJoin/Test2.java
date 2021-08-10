package MnogoPotochnost.MethodThread.SleepJoin;

public class Test2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyTheard());
        Test2 thread2 = new Test2();
        Thread thread3 = new Thread(new Test2());
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join(); thread2.join(); thread3.join();
        System.out.println("konec");
    }
}

class MyTheard implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}