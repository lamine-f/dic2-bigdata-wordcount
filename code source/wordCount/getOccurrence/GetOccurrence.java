package wordCount.getOccurrence;

import java.util.*;

public class GetOccurrence {

    private final Map<String, Integer> counts;

    public Map<String, Integer> getResult() {
        return counts;
    }

    public GetOccurrence () { counts = new HashMap<>(); }

    public void execute (String token) {
        counts.put(token, counts.getOrDefault(token, 0) + 1);
    }

    public void execute (List<String> tokenList) {
        tokenList.forEach( token -> counts.put(token, counts.getOrDefault(token, 0) + 1) );
    }

    public int getDifferentWordNumber () {
        return getResult().size();
    }

    public int getTotalWordNumber () {
        int total = 0;
        for (int value: counts.values()) total += value;
        return total;
    }

    public String getResume () {
        return String.format("%s words, %s total words", getDifferentWordNumber(), getTotalWordNumber());
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        for (String key: counts.keySet()) {
            message.append(String.format("Word: %s frequency: %s \n", key, counts.get(key)));
        }
        return message.toString();
    }
}