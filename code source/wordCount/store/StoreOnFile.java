package wordCount.store;



import java.io.*;

public class StoreOnFile implements Store {

    public void save (String value) {
        try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter("output.txt") )) {
            bufferedWriter.write(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
