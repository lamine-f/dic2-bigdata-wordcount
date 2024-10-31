package wordCount.reader;



import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColumnValueReader implements Reader {

    @Override
    public void execute (Callback callback) {
        try ( BufferedReader reader = new BufferedReader(new FileReader("resources/purchases.txt")) ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String regex = "(\\d{4}-\\d{2}-\\d{2})\\t(\\d{2}:\\d{2})\\t(.*?)\\t(.*?)\\t(\\d+\\.\\d{2})\\t(\\w+)";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);
                while ( matcher.find() ) {
                    for (int i=1; i<=6; i++) callback.call(matcher.group(i));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}