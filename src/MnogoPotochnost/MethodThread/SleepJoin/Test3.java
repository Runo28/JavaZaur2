package MnogoPotochnost.MethodThread.SleepJoin;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        Thread thread = new Thread(new Worked());
        System.out.println(thread.getState() + " !!!");
        thread.start();
        System.out.println(thread.getState() + " !!!");
        thread.join();
        System.out.println(thread.getState() + "  !!!");
        System.out.println("Main end");
    }

}

class Worked implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work end");
    }
}
