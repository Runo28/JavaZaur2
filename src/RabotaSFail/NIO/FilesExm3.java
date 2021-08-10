package RabotaSFail.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FilesExm3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test104.txt");
//        Files.createFile(filePath);
        String dialog = "-Privet\n-privet\n-kak dela?";
//        Files.write(filePath, dialog.getBytes());
        List<String> dialog2= Files.readAllLines(filePath);
       for (String s:dialog2 ){
           System.out.println(s);
       }

    }
}
