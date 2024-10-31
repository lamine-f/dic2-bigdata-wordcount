package wordCount.reader;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class WordByWordReader implements Reader {

    @Override
    public void execute (Callback callback) {
        try (BufferedReader bufferedReader = new BufferedReader( new FileReader("resources/purchases.txt") )) {
            String line;
            while ((line = bufferedReader.readLine()) != null)
                Arrays.stream(line.split("\\s+")).forEach(callback::call);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
