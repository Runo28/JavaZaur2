package RabotaSFail.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesExm2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test1.txt");
        Path folderPath = Paths.get("C:\\Users\\runo2\\Desktop\\JVM");
        Path folderPath2 = Paths.get("C:\\Users\\runo2\\Desktop\\java");
        Files.copy(filePath,folderPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING); //копирование файла в указаную директорию
//        Files.copy(filePath,folderPath.resolve("test1111.txt"));
        System.out.println(Files.exists(folderPath2));
       // Files.copy(folderPath2,folderPath.resolve("CCC"));
        System.out.println("--------------------------------------------");
        Path filePath3 = Paths.get("C:\\Users\\runo2\\Desktop\\JVM\\test123.txt");
       // Files.move(filePath3,folderPath2.resolve("test3.txt")); перемещение файла
//        Files.move(filePath3,folderPath.resolve("test123.txt")); переименование фалйа

        System.out.println("--------------------------------------------");
 //       Files.delete(filePath3); //удаление файла

    }
}
