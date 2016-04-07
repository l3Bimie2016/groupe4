package controller;

import fr.ModelWizardVehicule;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by nicol on 06/04/2016.
 */
@Controller
@RequestMapping("/wizard.form")
@SessionAttributes("modelWizard")
public class WizardController {
    private String[] pageViews = new String[] {"firstStepView","step2", "step3"};

    //Première étape
    @RequestMapping
    public ModelAndView processWizard() {
        return new ModelAndView("wizard/firstStepView","modelWizard", new ModelWizardVehicule());
    }

    // Renvois de l'étape suivant le numéro d'étape
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView processPage(@RequestParam("_page") int currentPage,
                                    @ModelAttribute("modelWizardVehicule") ModelWizardVehicule modelWizardVehicule) {
        System.out.println("test1");
        // pageViews est un tableau qui renvois le nom de la vue suivant le numéro d'étape
        return new ModelAndView("wizard/"+pageViews[currentPage-1]);
    }

    /**
     * Dernière page
     */
    @RequestMapping(params = "_finish")
    public ModelAndView processFinish(@ModelAttribute("modelWizardVehicule") ModelWizardVehicule modelWizardVehicule, SessionStatus status) {
        // suppression de l'objet en session
        status.setComplete();
        return new ModelAndView("wizard/successView");
    }

    @RequestMapping(params = "_cancel")
    public String processCancel(SessionStatus status) {
        // suppression de l'objet en session
        status.setComplete();
        return "wizard/canceledView";
    }

}
