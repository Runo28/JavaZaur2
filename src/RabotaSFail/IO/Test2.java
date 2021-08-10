package RabotaSFail.IO;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "Опасно! МакТоминай врывается справа в штрафную,\n " +
                "режет угол и бьет в ближний - вратарь ногами отбивает\n";

        try(
                FileWriter writer = new FileWriter("test3.txt");
        FileReader reader = new FileReader("test2.txt")) {

            int character;
            while ((character=reader.read())!=-1){
                writer.write(character);
                System.out.print((char)character);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
