package home.library.entities.state;

public class ErrorState implements BookState{

    private static ErrorState state;

    public ErrorState() {
        initialize();
    }

    public static ErrorState getInstance() {
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
        return "Error State";
    }

    private static void initialize() {
        if (state == null) {
            state = new ErrorState();
        }
    }
}
