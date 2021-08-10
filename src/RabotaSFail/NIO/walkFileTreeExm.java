package RabotaSFail.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class walkFileTreeExm {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\runo2\\Desktop\\X");
        Path path3 = Paths.get("test1.txt");


//        Files.walkFileTree(path,new  MyFileVisitor());
        Path path2 = Paths.get("E:\\");
   //     Files.walkFileTree(path2,new MyFileVisitor());

    }
}
class MyFileVisitor implements FileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Вход в директорию: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Имя файла: "+ file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Ошибка работы с файлом: "+file.getFileName());
//        if (file.getFileName()==file.){
//            System.out.println("Файл найден");
//            return FileVisitResult.TERMINATE;
//        }
        return FileVisitResult.SKIP_SIBLINGS;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Вышли из директории: "+dir);
        return FileVisitResult.CONTINUE;
    }
}
