package home.library.entities.state;

/**
 * Singleton to represent the state of inserting the
 * book into the database
 */
public class DatabaseEntryState implements BookState {
    private static DatabaseEntryState state;

    public DatabaseEntryState() {
        initialize();
    }

    public static BookState getState() {
        initialize();
        return state;
    }

    @Override
    public void process() {

    }

    @Override
    public BookState getNextState() {
        return CompletedState.getInstance();
    }

    @Override
    public String describeState() {
        return "Database Entry State";
    }

    private static void initialize() {
        if (state == null) {
            state = new DatabaseEntryState();
        }
    }
}
