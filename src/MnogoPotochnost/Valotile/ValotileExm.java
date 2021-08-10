package MnogoPotochnost.Valotile;

public class ValotileExm extends Thread {
    volatile public boolean b=true;

    @Override
    public void run() {
        long count = 0;
        while (b){
            count++;
        }
        System.out.println("Loop is finished. Count = "+count);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ValotileExm();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 second it is time to wake up!!");
        ((ValotileExm) thread).b = false;
        thread.join();
        System.out.println("Program finish");


    }
}
