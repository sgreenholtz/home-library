package home.library.entities.state;

/**
 * Singleton to represent sending the object to the user
 * for approval
 */
public class UserApprovalState implements BookState {

    private static UserApprovalState state;

    public UserApprovalState() {
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

    private static void initialize() {
        if (state == null) {
            state = new UserApprovalState();
        }
    }
}
