package MnogoPotochnost.ThreadExm;

public class Test4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <101 ; i++) {
                    System.out.println(i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i >0 ; i--) {
                    System.out.println(i);
                }
            }
        }).start();

    }
}
