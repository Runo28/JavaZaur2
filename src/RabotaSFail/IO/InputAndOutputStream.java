package RabotaSFail.IO;

import java.io.*;

public class InputAndOutputStream {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\runo2\\Desktop\\smile.jpeg");
             FileOutputStream outputStream = new FileOutputStream("smile.jpeg");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\runo2\\Desktop\\pic.jpg"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("pic.jpg"))
        ){

            int i;
            String line;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
            while ((i=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
