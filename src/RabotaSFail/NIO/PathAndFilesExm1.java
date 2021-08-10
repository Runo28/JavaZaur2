package RabotaSFail.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesExm1 {
    public static void main(String[] args) {
        Path filePath = Paths.get("test103.txt");
        Path folderPath = Paths.get("C:\\Users\\runo2\\Desktop\\JVM");
        System.out.println(filePath.getFileName());//возвращает имя файла или папки
        System.out.println(folderPath.getFileName());
        System.out.println("-----------------------------------------");
        System.out.println(filePath.getParent());//указывает родителя (расположение)
        System.out.println(folderPath.getParent());
        System.out.println("-----------------------------------------");
        System.out.println(filePath.getRoot());//указывает начальную директорию, корень диск
        System.out.println(folderPath.getRoot());
        System.out.println("-----------------------------------------");
        System.out.println(filePath.isAbsolute());//проверяет указан абсолютный путь или относительный
        System.out.println(folderPath.isAbsolute());
        System.out.println("-----------------------------------------");
        System.out.println(filePath.toAbsolutePath());//показывает абсолютный путь
        System.out.println(folderPath.toAbsolutePath());
        System.out.println("-----------------------------------------");
        System.out.println(folderPath.resolve(filePath));//объединяет два пути в один
        System.out.println("-----------------------------------------");
        Path filePath2 = Paths.get("C:\\Users\\runo2\\Desktop\\JVM\\J\\test103.txt");
        System.out.println(folderPath.relativize(filePath2));//указывает относительный адрес от определ. места



    }
}
