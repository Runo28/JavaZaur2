package RabotaSFail.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExm {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt","rw")){
            int a = file.read();
            System.out.println((char)a);

            String line = file.readLine();
            System.out.println(line);
            file.seek(200);
            line = file.readLine();
            System.out.println(line);
            System.out.println(file.getFilePointer());
            file.seek(file.length()-1);
            file.writeBytes("\n!!!!");



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
