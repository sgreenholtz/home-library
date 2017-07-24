package home.library.entities.state;

public interface BookState {

    BookState state = null;

    static BookState getState() {
        return state;
    }
    void process();
    BookState getNextState();
    String describeState();


}
