package controller;

import fr.ModeleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nicol on 05/04/2016.
 */
@RestController
public class ListController {

    @Autowired
    private ModeleService modeleService;

    @RequestMapping(path="/api/modeles", method= RequestMethod.GET)
    public List<String> fbm (@RequestParam String marque) {
        return modeleService.findByMarque(marque);
    }

    @RequestMapping(path="/api/test", method= RequestMethod.GET)
    public String d (@RequestParam String marque) {
        return marque;
    }

}
