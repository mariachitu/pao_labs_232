package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Example3 {
    public static void main(String[] args) {
        writeFiles("My_DIR/test2.txt", "My_DIR/test3.txt");
    }

    private static void writeFiles(String fileName, String otherFileName) {
        Path path = Paths.get(fileName);
        Path otherPath = Paths.get(otherFileName);
        try(BufferedWriter writer = Files.newBufferedWriter(path);
            BufferedWriter otherWriter = Files.newBufferedWriter(otherPath, StandardOpenOption.APPEND))  {
            writer.write("Hello2");
            writer.newLine();
            writer.write("Hello");
            writer.newLine();

            otherWriter.write("Hello1111");
            otherWriter.newLine();
            otherWriter.write("Hello111");
            otherWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
