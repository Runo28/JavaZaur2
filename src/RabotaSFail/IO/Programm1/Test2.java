package RabotaSFail.IO.Programm1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Test2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ruslan", "Huba", 15000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("emp.bin"))){
            outputStream.writeObject(emp1);
            System.out.println("Finish");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
