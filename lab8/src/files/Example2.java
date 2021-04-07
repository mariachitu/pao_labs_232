package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        //printContentWithoutTryWithResources("My_DIR/test.txt");
        //printContentWithTryWithResources("My_DIR/test.txt");
        readAndPrintAllLines("My_DIR/test.txt");
    }

    private static void readAndPrintAllLines(String fileName)   {
        Path path = Paths.get(fileName);
        try {
            List<String> input = Files.readAllLines(path);
            //byte[] input = Files.readAllBytes(path);
            for(String line : input)    {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printContentWithTryWithResources(String fileName)    {
        Path path = Paths.get(fileName);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            int noLine = 0;
            while ((line = reader.readLine()) != null)  {
                System.out.println(++noLine + " : " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printContentWithoutTryWithResources(String fileName)    {
        Path path = Paths.get(fileName);
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(path);
            String line;
            int noLine = 0;
            while ((line = reader.readLine()) != null)  {
                System.out.println(++noLine + " : " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
