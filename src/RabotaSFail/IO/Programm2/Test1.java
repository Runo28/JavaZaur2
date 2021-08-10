package RabotaSFail.IO.Programm2;

import RabotaSFail.IO.Programm1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test1 {
    public static void main(String[] args) {
      Employee bestEmployee;
      try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("emp.bin"))){
          bestEmployee= (Employee) inputStream.readObject();
          System.out.println(bestEmployee);
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }

    }
}
