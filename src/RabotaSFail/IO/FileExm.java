package RabotaSFail.IO;

import java.io.File;
import java.io.IOException;

public class FileExm {
    public static void main(String[] args) throws IOException {
        File file = new File("test3.txt");
        File folder = new File("C:\\Users\\runo2\\Desktop\\java");
        File folder2 = new File("C:\\Users\\runo2\\Desktop\\java3");
        File file2 = new File("C:\\Users\\runo2\\Desktop\\java\\test1.txt");
        File folder3 = new File("D:\\Шаг\\Zaur\\JavaBleak\\Generics");
        System.out.println(file.getAbsoluteFile()); // адрес файла или папки
        System.out.println(folder.getAbsoluteFile());
        System.out.println("---------------------------------------------");
        System.out.println("file.isAbsolute " + file.isAbsolute()); //проперяет указан полній адрес или нет
        System.out.println("folder.isAbsolute " + folder.isAbsolute());
        System.out.println("---------------------------------------------");
        System.out.println(file.isDirectory());
        System.out.println(folder.isAbsolute());//проверяет это папка или нет
        System.out.println("---------------------------------------------");
        System.out.println(file.exists());
        System.out.println(file2.exists());
        System.out.println(folder.exists());//проверяет существует такой фалй или нет
        System.out.println("---------------------------------------------");
        System.out.println(file2.createNewFile());//создает новый файл
        System.out.println(file.createNewFile());
        System.out.println(folder2.mkdir());//создает новую папку
        System.out.println("---------------------------------------------");
        System.out.println(file.length());//размер файла или папки
        System.out.println(folder.length());
        System.out.println("---------------------------------------------");
        System.out.println(file2.delete());//удаление файла или папки
        System.out.println(folder2.delete());
        System.out.println("---------------------------------------------");
        File[] folders = folder3.listFiles(); //возвращает массив, в котором содержится, что на ходится внутри папки
       // System.out.println(Arrays.toString(folders));
       // for (int i = 0; i <folders.length ; i++) {System.out.println(folders[i]); }
        for (File f:folders){System.out.println(f);}
        System.out.println("---------------------------------------------");
        System.out.println(file.isHidden()); //проверяет скрытли файл или папка
        System.out.println(folder.isHidden());
        System.out.println("---------------------------------------------");
        System.out.println(file.canRead()); //есть ли доступ на чтение из файла
        System.out.println(file.canWrite());// есть ли доступ на запись в данный файл
        System.out.println(file.canExecute()); // есть ли доступ на запуск данного файла
        System.out.println("---------------------------------------------");
    }
}
