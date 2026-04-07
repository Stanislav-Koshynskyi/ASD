package practs_koshynskyi.pract12_koshynskyi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class InboxArchiver {
    public static void archiveTmpFiles(Path inbox, Path archive){

        try {
            if(Files.notExists(archive)){
                Files.createDirectories(archive);
            }
            Files.walk(inbox).filter(f ->
                    f.getFileName().toString().endsWith(".tmp") && Files.isRegularFile(f))
                    .forEach(f -> {
                        try {
                            Files.move(f,
                                    archive.resolve(f.getFileName())
                                    , StandardCopyOption.ATOMIC_MOVE);
                        } catch (IOException e) {
                            System.out.println("Failed to move " + f.getFileName());
                        }
                    });
        } catch (IOException e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }
}
