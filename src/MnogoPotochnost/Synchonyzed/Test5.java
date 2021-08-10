package MnogoPotochnost.Synchonyzed;

public class Test5 {
    static final BBB b = new BBB();

    void mobileCall () {
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mobile call ends");
    }

    void SkypeCall () {
        System.out.println("Skype call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Skype call ends");
    }

    void WhatsAppCall () {
        System.out.println("WhatsApp call starts");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("WhatsApp call ends");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpMobile implements Runnable {
    @Override
    public void run() {
        synchronized (Test5.b){
        new Test5().mobileCall();}
    }
}

class RunnableImpSkype implements Runnable {
    @Override
    public void run() {
        synchronized (Test5.b){
        new Test5().SkypeCall();}
    }
}

class RunnableImpWhatsApp implements Runnable {
    @Override
    public void run() {
        synchronized (Test5.b){
        new Test5().WhatsAppCall();}
    }
}

class BBB {

}