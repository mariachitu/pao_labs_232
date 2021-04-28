package ex7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalLong;
import java.util.stream.Stream;

public class FileCountingWords implements Runnable {

    private final String filename;
    private final String wordSearched;
    private OptionalLong wordCounter;

    public FileCountingWords(String filename, String wordSearched) {
        this.filename = filename;
        this.wordSearched = wordSearched;
        this.wordCounter = OptionalLong.empty();
    }

    private long countWords()    {
        Path path = Paths.get(filename);
        try {
            Stream<String> lines = Files.lines(path);
            return lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .map(word -> word.toLowerCase())
                    .filter(word -> word.equals(wordSearched.toLowerCase()))
                    .count();
        } catch (IOException e) {
           throw new RuntimeException("Error at counting..");
        }
    }

    @Override
    public void run() {
        try {
            wordCounter = OptionalLong.of(countWords());
        } catch (Exception e)   {
            wordCounter = OptionalLong.of(0);
        }
    }

    public OptionalLong getWordCounter() {
        return wordCounter;
    }

    public String getFilename() {
        return filename;
    }
}
