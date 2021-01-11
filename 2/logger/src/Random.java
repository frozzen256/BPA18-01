import java.util.List;

public class Random {
    private List<String> phrases;

    public Random(List<String> phrases) {
        this.phrases = phrases;
    }

    public String getPhrase() {
        return phrases.get((int) (Math.random() * phrases.size()));
    }
}