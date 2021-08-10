package MnogoPotochnost.InterruptionExm;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSumm = 0;
    public void run() {
        for (int i = 1; i <=1_000_000_000 ; i++) {
            if (isInterrupted()){
                System.out.println("Поток хотят прервать");
                System.out.println(sqrtSumm);
                return ;
            }
            sqrtSumm+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сня, давай завершим его работу");
                return;
            }
        }
        System.out.println(sqrtSumm);
    }
}