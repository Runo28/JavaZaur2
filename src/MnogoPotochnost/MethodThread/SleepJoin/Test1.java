package MnogoPotochnost.MethodThread.SleepJoin;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <11 ; i++) {
            System.out.println(i);
            Thread.sleep(300);
        }
    }
}
