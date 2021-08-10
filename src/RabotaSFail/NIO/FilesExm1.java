package RabotaSFail.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FilesExm1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test103.txt");
        Path folderPath = Paths.get("C:\\Users\\runo2\\Desktop\\JVM");
        if (!Files.exists(filePath)){
            System.out.println(Files.exists(filePath));//проверяет, существует ли файл
            Files.createFile(filePath);//создает файл
            System.out.println(Files.exists(filePath));
        }
        if (!Files.exists(folderPath)){
            System.out.println(Files.exists(folderPath));
            Files.createDirectory(folderPath);//создает папку
            System.out.println(Files.exists(folderPath));
        }
        System.out.println(Files.isReadable(filePath));//возможно ли прочитать файл
        System.out.println(Files.isWritable(filePath));//возможно ли записать в файл
        System.out.println(Files.isExecutable(filePath));//возможно ли запустить файл
        System.out.println("----------------------------------");
        Path filePath2 = Paths.get("D:\\Шаг\\Zaur\\JavaBleak\\Generics\\test103.txt");
        Path filePath3 = Paths.get("D:\\Шаг\\Zaur\\JavaBleak\\Generics\\test3.txt");
        System.out.println(Files.isSameFile(filePath,filePath2)); //проверяет сылаются ли обе сылки на один файл
        System.out.println(Files.isSameFile(filePath,filePath3));
        System.out.println("----------------------------------");
        System.out.println(Files.size(filePath3)); //размер файла
        System.out.println("----------------------------------");
        System.out.println(Files.getAttribute(filePath3,"creationTime")); //возвращает атрибут файла
        System.out.println(Files.getAttribute(filePath3,"size"));
        System.out.println("----------------------------------");
        System.out.println(Files.readAttributes(filePath3,"*"));//все атрибуты
        Map<String,Object> attributes=Files.readAttributes(filePath3,"*");
        for (Map.Entry<String,Object>map:attributes.entrySet()){
            System.out.println(map.getKey()+"  =  "+map.getValue());
        }

        System.out.println("----------------------------------");




    }
}
