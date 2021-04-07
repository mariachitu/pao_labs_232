package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

    public static void main(String[] args) {
        try {
          //  createFile("generatedFile.txt");
          //  createFolder("My_DIR");
//            createFile("My_DIR/test2.txt");
//            createFile("My_DIR/test3.txt");
            listContentFolder("My_DIR");
           // createFolder("My_DIR/A/B/C");
            deleteFile("generatedFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.createFile(path);
    }

    private static void createFolder(String folderName) throws IOException  {
        Path path = Paths.get(folderName);
        Files.createDirectories(path);
    }

    private static void listContentFolder(String folderName) throws IOException {
        Path path = Paths.get(folderName);
        Files.list(path).forEach(elem -> System.out.println(elem));
    }

    private static void deleteFile(String fileName) throws IOException  {
        Path path = Paths.get(fileName);
        Files.delete(path);
    }
}
