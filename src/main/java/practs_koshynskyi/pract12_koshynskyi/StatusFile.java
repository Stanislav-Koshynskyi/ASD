package practs_koshynskyi.pract12_koshynskyi;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class StatusFile {
    public static void create (Path in, int n){
        if  (Files.notExists(in)) {
            try {
                Files.createDirectories(in);
                byte[] buffer = new byte[n];
                Files.write(in, buffer, StandardOpenOption.CREATE);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void updateStatus(Path file,long index,int status){
        try (FileChannel channel = FileChannel.open(file, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[]{(byte)status});
            channel.position(index);
            channel.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
