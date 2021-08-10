package RabotaSFail.IO;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        String s = "Шотландский \"Рейнджерс\" продолжил свою беспроигрышную серию," +
                " \nдважды отыгрываясь по ходу первого матча 1/16 финала Лиги Европы против \"Антверпена\"." +
                " \nИ уже на 90-й минуте подопечные Стивена Джеррарда, реализовав пенальти, вырвали победу - 4:3.\n";
        try (FileWriter writer1 = new FileWriter("test1.txt", true);
             FileReader reader1 = new FileReader("test1.txt");
             FileWriter writer2 = new FileWriter("test2.txt", true);
             BufferedReader reader3 = new BufferedReader(new FileReader("C:\\Users\\runo2\\Desktop\\AntiFriz.txt"));
             BufferedWriter writer3 = new BufferedWriter(new FileWriter("test3.txt"));

        ) {
            int character;
            String line;
            String line2 = "";
            writer1.write(s);
            while ((character = reader1.read()) != -1) {
                writer2.write((char) character);
            }
            while ((line = reader3.readLine()) != null) {
                writer3.write(line + "\n");
                line2 += line+"\n";
            }

            System.out.println(line2);
            System.out.println("Finish!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
