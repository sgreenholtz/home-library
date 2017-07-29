package home.library.dataservices;

import home.library.entities.loc.ModsType;
import home.library.util.Props;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Communicates with the Library of Congress web service
 * @author Sebastian Greenholtz
 */
@Component
public class LibraryOfCongressService {

    public ModsType getLibraryOfCongressBook(Integer lccn) {
        RestTemplate template = new RestTemplate();
        return template.getForObject(Props.getLocUrl(lccn), ModsType.class);
    }
}
