package MnogoPotochnost.Synchonyzed.DeadLockExm;

public class Test1 {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread10());
        Thread thread2 = new Thread(new Thread20());
        thread1.start();
        thread2.start();
    }

}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта lock1");
        synchronized (Test1.lock1){
            System.out.println("Thread10: Монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта lock2");
            synchronized (Test1.lock2){
                System.out.println("Thread10: Монитор объекта lock1 захвачен" + "и монитор объекта lock2 захвачен");
            }
        }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта lock2");
        synchronized (Test1.lock2){
            System.out.println("Thread20: Монитор объекта lock2 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта lock1");
            synchronized (Test1.lock1){
                System.out.println("Thread20: Монитор объекта lock1 захвачен" + "и монитор объекта lock2 захвачен");
            }
        }
    }
}