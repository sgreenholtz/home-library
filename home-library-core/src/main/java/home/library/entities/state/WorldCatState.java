package home.library.entities.state;

import org.springframework.stereotype.Component;

/**
 * Singleton to represent the state of a query out to
 * WorldCat and awaiting response
 */
@Component
public class WorldCatState {

    private WorldCatState state;

    public WorldCatState() {
        if (state == null) {
            state = new WorldCatState();
        }
    }

    public WorldCatState getInstance() {
        return state;
    }
}
