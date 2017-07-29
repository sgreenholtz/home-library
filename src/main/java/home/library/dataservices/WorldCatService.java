package home.library.dataservices;

import home.library.entities.worldcat.RspType;
import home.library.util.Props;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Communicates with the WorldCat service
 */
@Component
public class WorldCatService {

    public RspType getWorldCatBook(Integer isbn) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(Props.getWorldCatUrl(isbn), RspType.class);
    }

}
