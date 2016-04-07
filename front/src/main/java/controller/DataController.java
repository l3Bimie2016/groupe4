package controller;

import fr.ModelWizardVehicule;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by nicol on 05/04/2016.
 */
@Controller
@SessionAttributes("modelWizard")
public class DataController {

    @RequestMapping(path="/api/send/devis/etape1", method= RequestMethod.POST)
    public ModelAndView vehiculeStep1(@ModelAttribute("modelWizardVehicule") ModelWizardVehicule modelWizardVehicule, Map<String, Object> model, HttpRequest request, @RequestParam String nomDevis, @RequestParam String marque, @RequestParam String modele, @RequestParam String carburant, @RequestParam String chvxfiscaux) {
        if(!nomDevis.equals("") && !marque.equals("") && !modele.equals("") && !carburant.equals("") && !chvxfiscaux.equals("")) {
            return new ModelAndView("redirect:/devis/vehicule/etape2");
        } else {
            return new ModelAndView("redirect:/devis/vehicule/etape1?error=true");
        }
    }

    @RequestMapping(path="/api/send/devis/etape2", method= RequestMethod.POST)
    public ModelAndView vehiculeStep2(Map<String, Object> model, HttpRequest request, @RequestParam String datePermis, @RequestParam String nbAccident, @RequestParam String bonusMalus) {
        if(!datePermis.equals("") && !nbAccident.equals("") && !bonusMalus.equals("")) {
            return new ModelAndView("redirect:/devis/vehicule/etape3");
        } else {
            return new ModelAndView("redirect:/devis/vehicule/etape2?error=true");
        }
    }

}
