package home.library.entities.state;

public class CompletedState implements BookState {

    private static CompletedState state;

    private static void initialize() {
        if (state == null) {
            state = new CompletedState();
        }
    }

    public CompletedState() {
        initialize();
    }

    public static BookState getInstance() {
        initialize();
        return state;
    }

    @Override
    public void process() {

    }

    @Override
    public BookState getNextState() {
        return null;
    }

    @Override
    public String describeState() {
        return "Book Record Complete State";
    }
}
