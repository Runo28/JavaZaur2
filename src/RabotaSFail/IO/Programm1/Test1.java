package RabotaSFail.IO.Programm1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> employee = new ArrayList<>();
        employee.add("Ruslan");
        employee.add("Irina");
        employee.add("Natasha");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Emp1.bin"))){
        outputStream.writeObject(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
