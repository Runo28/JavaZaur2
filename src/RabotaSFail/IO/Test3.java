package RabotaSFail.IO;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test3.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test4.txt"));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter("test5.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("test3.txt")))
        {
            int chatacter;
            while ((chatacter=reader.read())!=-1){
                writer.write((char)chatacter);
                System.out.print((char)chatacter);
            }
            String line;
            while ((line=reader.readLine())!=null){
                writer2.write(line+"\n");
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
