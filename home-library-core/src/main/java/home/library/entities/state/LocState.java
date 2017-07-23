package home.library.entities.state;

import org.springframework.stereotype.Component;

/**
 * Singleton to represent a query out to library of congress
 * and resolving content
 */
@Component
public class LocState {

    private LocState state;

    public LocState() {
        if (state == null) {
            state = new LocState();
        }
    }

    public LocState getInstance() {
        return state;
    }
}
