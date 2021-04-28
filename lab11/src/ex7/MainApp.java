package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        List<String> files = List.of(
                "C:\\Courses\\pao_labs_232\\lab11\\src\\input.txt",
                "C:\\Courses\\pao_labs_232\\lab11\\src\\input2.txt",
                "C:\\Courses\\pao_labs_232\\lab11\\src\\input3.txt"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter word to search: ");
        String wordSearched = scanner.next();

        List<FileCountingWords> countsRunnable = new ArrayList<>();
        for (String file : files)   {
            FileCountingWords fileCountingWords = new FileCountingWords(file, wordSearched);
            countsRunnable.add(fileCountingWords);
            Thread thread = new Thread(fileCountingWords);
            thread.start();
        }

        long sum = 0;
        for(FileCountingWords fileCountingWords : countsRunnable)   {
            while (fileCountingWords.getWordCounter().isEmpty())    {
                Thread.sleep(500);
            }
            System.out.println(fileCountingWords.getFilename() + " : " + fileCountingWords.getWordCounter().getAsLong());
            sum +=  fileCountingWords.getWordCounter().getAsLong();
        }

        System.out.println("Total number = " + sum);
    }
}
