package RabotaSFail.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExm1 {
    public static void main(String[] args) throws IOException {
        String s1 = "Опасно! МакТоминай врывается справа в штрафную,\n " +
                "режет угол и бьет в ближний - вратарь ногами отбивает\n";
        String s2 = "ГООООЛ!!! Джеймс убежал слева, вошел в штрафную и пробил " +
                "в \"домик\" вратарю\n";

        FileWriter fileWriter=null;
        FileWriter fileWriter2=null;
        try {
//            fileWriter = new FileWriter("C:\\Users\\runo2\\Desktop\\test2.txt");
//            for (int i = 0; i <s1.length() ; i++) {
//                fileWriter.write(s1.charAt(i));
            //            }
            fileWriter = new FileWriter("test2");



            fileWriter.write(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileWriter.close();
            fileWriter2.close();
        }



    }
}
