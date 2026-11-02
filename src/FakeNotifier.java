import java.util.ArrayList;
import java.util.List;

// Extra: a "fake" notifier that sends nothing, it only remembers the messages.
// Useful for tests: we check what would have been sent.
public class FakeNotifier implements Notifier {

    private final List<String> sent = new ArrayList<>();

    @Override
    public void send(String message) {
        sent.add(message);
    }

    public int getSentCount() {
        return sent.size();
    }
}
