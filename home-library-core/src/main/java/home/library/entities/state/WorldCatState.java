package home.library.entities.state;

/**
 * Singleton to represent the state of a query out to
 * WorldCat and awaiting response
 */
public class WorldCatState implements BookState {

    private static WorldCatState state;

    public WorldCatState() {
        initialize();
    }

    public static WorldCatState getInstance() {
        initialize();
        return state;
    }

    @Override
    public void process() {

    }

    @Override
    public BookState getNextState() {
        return LocState.getInstance();
    }

    private static void initialize() {
        if (state == null) {
            state = new WorldCatState();
        }
    }
}
