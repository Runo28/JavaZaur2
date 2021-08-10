package MnogoPotochnost.MethodThread.NamePriority;

public class NamePriority {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("My of myThread1 = "+myThread1.getName() +
                " Priority of myThread1 = "+myThread1.getPriority());
//        MyThread1 myThread2 = new MyThread1();
//        System.out.println("My of myThread2 = "+myThread2.getName() +
//                " Priority of myThread2 = "+myThread2.getPriority());
        myThread1.setPriority(2);
        System.out.println("My of myThread1 = "+myThread1.getName() +
                " Priority of myThread1 = "+myThread1.getPriority());
        myThread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("My of myThread1 = "+myThread1.getName() +
                " Priority of myThread1 = "+myThread1.getPriority());
        myThread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("My of myThread1 = "+myThread1.getName() +
                " Priority of myThread1 = "+myThread1.getPriority());


    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("privet");
    }
}