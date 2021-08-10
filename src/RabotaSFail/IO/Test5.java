package RabotaSFail.IO;

import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        String s = "Команда Юргена Клоппа потерпела четвертое подряд поражение на \"Энфилде\"";

        try (BufferedWriter writer1 =new BufferedWriter
                (new FileWriter("C:\\Users\\runo2\\Desktop\\java\\test1.txt",true));
             BufferedReader reader = new BufferedReader
                     (new FileReader("C:\\Users\\runo2\\Desktop\\java\\test1.txt"));
             BufferedWriter writer2 =new BufferedWriter
                     (new FileWriter("C:\\Users\\runo2\\Desktop\\java\\test2.txt"));
        ){
            writer1.write(s);
            String line;
            while ((line=reader.readLine())!=null){
                writer2.write(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
