package RabotaSFail.IO;

import java.io.*;

public class BufferedExm {
    public static void main(String[] args) {
        String s1 = "Опасно! МакТоминай врывается справа в штрафную,\n " +
                "режет угол и бьет в ближний - вратарь ногами отбивает\n";
        String s2 = "ГООООЛ!!! Джеймс убежал слева, вошел в штрафную и пробил " +
                "в \"домик\" вратарю\n";
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test5.txt"));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter("test6.txt"))) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                System.out.print((char) reader.read());
            }
          //  writer2.write(s1);
            writer2.write(s1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
