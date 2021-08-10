package RabotaSFail.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 extends FileReader {
    public Test1(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public Test1(File file) throws FileNotFoundException {
        super(file);
    }

    public static void main(String[] args) throws IOException {
        Test1 read = null;
        Test1 read2 = new Test1("test2.txt");
        read = new Test1("C:\\Users\\runo2\\Desktop\\вайфай.txt");
        int character;
        while ((character=read2.read())!=-1){
            System.out.print((char)character);
        }
        read.close();

    }
}
