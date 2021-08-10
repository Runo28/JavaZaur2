package MnogoPotochnost.MethodThread.NamePriority;

public class Test1 implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Method run. thead name = "+Thread.currentThread());
//    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test1());
        thread1.start();
    }
}
