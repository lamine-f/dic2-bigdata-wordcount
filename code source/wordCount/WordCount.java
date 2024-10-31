package wordCount;

import wordCount.getOccurrence.GetOccurrence;
import wordCount.reader.Reader;
import wordCount.store.Store;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class WordCount {

    private final Reader reader;
    private final Store store;

    public WordCount (Reader reader, Store store) {
        this.reader = reader;
        this.store = store;
    }

    public GetOccurrence withArray () {
        GetOccurrence getOccurrence = new GetOccurrence();
        List<String> tokenList = Arrays.asList("A", "A", "B", "D", "C", "F", "E", "C", "B" );
        Instant start = Instant.now();
        getOccurrence.execute(tokenList);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        String result = getOccurrence
                + getOccurrence.getResume() + "\n"
                + String.format("Duration: %s secondes" , duration.getSeconds());
        System.out.println(result);
        store.save(result);
        return getOccurrence;
    }

    public GetOccurrence withPurchasesFile () {
        GetOccurrence getOccurrence = new GetOccurrence();
        Instant start = Instant.now();
        reader.execute(getOccurrence::execute);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        String result = getOccurrence
                + getOccurrence.getResume() + "\n"
                + String.format("Duration: %s secondes" , duration.getSeconds());
        System.out.println(result);
        store.save(result);
        return getOccurrence;
    }

}