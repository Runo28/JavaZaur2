package RabotaSFail.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\runo2\\Desktop\\X");
        Path destination = Paths.get("C:\\Users\\runo2\\Desktop\\copy X");
        Files.walkFileTree(source,new MyFileVisitor2(source,destination));

    }

}

class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    Path source; //откуда идет копирование
    Path destination; //куда будет копироваться

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }



    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
    //    System.out.println("Вход в директорию: " + dir);
        Path NewDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir,NewDestination,StandardCopyOption.REPLACE_EXISTING); //копирование папки
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
   //     System.out.println("Имя файла: "+ file.getFileName());
        Path NewDestination = destination.resolve(source.relativize(file));
        Files.copy(file,NewDestination,StandardCopyOption.REPLACE_EXISTING); //копирование файла
        return FileVisitResult.CONTINUE;
    }
}