package MnogoPotochnost.Synchonyzed.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExm {
    public static void main(String[] args) {
        Call call = new Call();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.SkypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.WhatsAppCall();
            }
        });

        thread2.start();
        thread3.start();
        thread1.start();

    }
}

class Call {
    Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("mobileCall starts");
            for (int i = 3; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("mobileCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    void SkypeCall() {
        lock.lock();
        try {
            System.out.println("SkypeCall starts");
            for (int i = 5; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("SkypeCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void WhatsAppCall() {
        lock.lock();
        try {
            System.out.println("WhatsAppCall starts");
            for (int i = 7; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("WhatsAppCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}