package wordCount.reader;

public interface Reader {
    interface Callback {
        void call(String token);
    }
    void execute( Callback callback );
}