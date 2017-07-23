package home.library.entities.state;

public class ErrorState {

    private ErrorState state;

    public ErrorState() {
        if (state == null) {
            state = new ErrorState();
        }
    }

    public ErrorState getInstance() {
        return state;
    }
}
