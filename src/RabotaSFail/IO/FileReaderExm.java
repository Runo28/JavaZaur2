package RabotaSFail.IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExm {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("test5.txt");
            int character;
            System.out.println();
            while ((character=fileReader.read())!=-1){
            System.out.print((char)character);}
            System.out.println();
            System.out.println(fileReader.getEncoding());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileReader.close();
        }
    }
}
