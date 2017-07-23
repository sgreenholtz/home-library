package home.library.entities;

import home.library.entities.loc.ModsType;
import home.library.entities.worldcat.RspType;
import org.springframework.stereotype.Component;

@Component
public class BookFactory {

    private RspType worldCatBook;
    private ModsType locBook;
    private Book book;
    private State state;

}
