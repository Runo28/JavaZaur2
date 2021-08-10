package RabotaSFail.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanneBufferExm2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test102.txt","r");
             FileChannel channel = file.getChannel();
        ){

            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
            channel.read(byteBuffer);
            byteBuffer.flip();
            System.out.print((char)byteBuffer.get());
            System.out.print((char)byteBuffer.get());
            System.out.print((char)byteBuffer.get()+"\n");

            byteBuffer.rewind();
            System.out.print((char)byteBuffer.get());
            System.out.print((char)byteBuffer.get()+"\n");
            System.out.println("----------------------------------------------");
            byteBuffer.compact();
            channel.read(byteBuffer);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()){
                System.out.print((char) byteBuffer.get());
            }
            byteBuffer.clear();
            channel.read(byteBuffer);
            byteBuffer.flip();
            System.out.print((char) byteBuffer.get());
            byteBuffer.mark();
            System.out.print((char) byteBuffer.get());
            System.out.print((char) byteBuffer.get());
            byteBuffer.reset();
            System.out.print((char) byteBuffer.get());
            System.out.print((char) byteBuffer.get());




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
