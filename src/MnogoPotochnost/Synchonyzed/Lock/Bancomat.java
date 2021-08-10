package MnogoPotochnost.Synchonyzed.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bancomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Employee emp1 = new Employee("Ruslan",lock);
        Employee emp2 = new Employee("Irina",lock);
        Employee emp3 = new Employee("Karolina",lock);
        Employee emp4 = new Employee("Oleh",lock);
        Employee emp5 = new Employee("Ihor",lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;
    Employee (String name,Lock lock){
        this.name=name;
        this.lock=lock;
        this.start();
    }

    @Override
    public void run() {

        try {
            System.out.println(name + " ждет...");
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил свои дела");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

    }
}
