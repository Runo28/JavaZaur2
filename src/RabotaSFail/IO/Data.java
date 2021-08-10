package RabotaSFail.IO;

import java.io.*;

public class Data {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("test10.bin"));
                DataInputStream inputStream = new DataInputStream(new FileInputStream("test10.bin"));

        ){
            outputStream.writeBoolean(true);
            outputStream.writeChar(135);
            outputStream.writeShort(555);
//            String line = "";
//            line+=inputStream.read();
//            System.out.println(line);
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readChar());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
