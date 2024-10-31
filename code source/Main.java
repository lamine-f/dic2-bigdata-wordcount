import wordCount.WordCount;
import wordCount.getOccurrence.GetOccurrence;
import wordCount.reader.ColumnValueReader;
import wordCount.reader.Reader;
import wordCount.reader.WordByWordReader;
import wordCount.store.Store;
import wordCount.store.StoreOnFile;

public class Main {

    public static void main(String[] args) {
        Reader reader = new WordByWordReader();
        Store store = new StoreOnFile();
        WordCount wordCount = new WordCount(reader, store);
        GetOccurrence getOccurrence = wordCount.withPurchasesFile();
    }
}