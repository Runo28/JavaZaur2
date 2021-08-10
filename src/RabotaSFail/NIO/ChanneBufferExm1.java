package RabotaSFail.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanneBufferExm1 {
    public static void main(String[] args) {
        String string = "\n\"Эвертон\" одержал первую победу на \"Энфилде\" над городским соперником " +
                "\"Ливерпулем\" после 22 лет ожидания. \"Ириски\" выиграли со счетом 2:0 после того, " +
                "как Ришарлисон открыл счет на третьей минуте после шикарного паса Хамеса Родригеса, " +
                "а Гильфи Сигурдссонустановил окончательный результат на 83-й минуте с пенальти, " +
                "назначенный за фол Александр-Арнольда на Калверт-Льюине. Стоит отметить и вратаря " +
                "\"ирисок\" Джоржана Пикфордва, который спас в нескольких супермоментах \"Ливерпуля\".";
        try (RandomAccessFile file = new RandomAccessFile("test1.txt","rw");
             FileChannel channel = file.getChannel();
             ){
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder sb = new StringBuilder();
            int byteRead= channel.read(buffer);
           while (byteRead>0){
   //            System.out.println("Read" + byteRead);
               buffer.flip();
               while (buffer.hasRemaining()){
                   sb.append((char)buffer.get());
               }
               buffer.clear();
               byteRead= channel.read(buffer);

           }
           buffer.flip();
           while (buffer.hasRemaining()){
               sb.append((char)buffer.get());
           }
            System.out.println(sb);
//           ByteBuffer buffer2 = ByteBuffer.allocate(string.getBytes().length);
//           buffer2.put(string.getBytes());
//           buffer2.flip();
//           channel.write(buffer2);

            ByteBuffer buffer2 = ByteBuffer.wrap(string.getBytes());
            channel.write(buffer2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
