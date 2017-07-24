package home.library.entities.state;

/**
 * Singleton to represent a query out to library of congress
 * and resolving content
 */
public class LocState implements BookState{

    private static LocState state;

    public LocState() {
        initialize();
    }

    public static LocState getInstance() {
        initialize();
        return state;
    }

    @Override
    public void process() {

    }

    @Override
    public BookState getNextState() {
        return UserApprovalState.getInstance();
    }

    @Override
    public String describeState() {
        return "Library of Congress State";
    }

    private static void initialize() {
        if (state == null) {
            state = new LocState();
        }
    }
}
