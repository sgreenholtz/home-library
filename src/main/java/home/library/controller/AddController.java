package home.library.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Add new boo
 * @author Sebastian Greenholtz
 */
@RestController
public class AddController {

    static Logger LOG = LoggerFactory.getLogger(AddController.class);

    @PostMapping(value = "/add")
    @ResponseBody
    public void addBook(Integer id) {
        LOG.debug("Entering addBook, id: " + id);

        LOG.debug("Exiting addBook, result: ");
    }
}
