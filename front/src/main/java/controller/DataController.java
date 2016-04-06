package controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by nicol on 05/04/2016.
 */
@Controller
public class DataController {

    @RequestMapping(path="/api/send/devis/etape1", method= RequestMethod.POST)
    public ModelAndView dash(Map<String, Object> model, HttpRequest request, @RequestParam String nomDevis, @RequestParam String marque, @RequestParam String modele, @RequestParam String carburant, @RequestParam String chvxfiscaux) {
        if(!nomDevis.equals("") && !marque.equals("") && !modele.equals("") && !carburant.equals("") && !chvxfiscaux.equals("")) {
            return new ModelAndView("redirect:/devis/vehicule/etape2");
        } else {
            return new ModelAndView("redirect:/devis/vehicule/etape1?error=true");
        }

    }

}
