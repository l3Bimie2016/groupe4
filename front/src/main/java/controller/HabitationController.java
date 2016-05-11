package controller;

import fr.ModelWizardHabitation;
import fr.ModelWizardVehicule;
import fr.SessionData;
import fr.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Joelle on 05/04/2016.
 */
@Controller
@SessionAttributes("modelWizardHabitation")
public class HabitationController {

    @Autowired
    private SessionData modelUser;

    @Autowired
    private DevisHabitationService devisHabitationService;

    @RequestMapping(value = "/private/devis/habitation/etape1", method = RequestMethod.GET)
    public ModelAndView step1(Map<String, Object> model) {
        //todo get connected user
        /*User userTest = new User();
        userTest.setFirstName("Foo");
        userTest.setLastName("Quagaan");
        userTest.setLogin("Foo");
        userTest.setPassword("foo");

        //todo service to get habitationTypesList
        List<String> habitationTypesList = new ArrayList<String>();
        habitationTypesList.add("Maison");
        habitationTypesList.add("Château");
        habitationTypesList.add("T1");
        habitationTypesList.add("T2");


        ModelAndView step1 = new ModelAndView("/devis/habitation-etape-1");
        model.put("firstName", userTest.getFirstName());
        model.put("lastName", userTest.getLastName());
        model.put("habitationTypes", habitationTypesList);
        return step1;*/

        return new ModelAndView("devis/habitation-etape-1", "modelWizardHabitation", new ModelWizardHabitation());

    }

    @RequestMapping("/private/back/devis/habitation/etape1")
    public ModelAndView backStep1(@ModelAttribute("modelWizardHabitation") @Valid ModelWizardHabitation modelWizardHabitation, BindingResult bindingResult) {
        return new ModelAndView("devis/habitation-etape-1", "modelWizardHabitation", modelWizardHabitation);
    }

    @RequestMapping("/private/devis/habitation/etape2")
    public ModelAndView step2(@ModelAttribute("modelWizardHabitation") @Valid ModelWizardHabitation modelWizardHabitation, BindingResult bindingResult) {
        modelWizardHabitation.setStep(1);
        ModelAndView step2 = new ModelAndView("devis/habitation-etape-2", "modelWizardHabitation", modelWizardHabitation);
        Integer devisId = devisHabitationService.convertAndSaveByStep(modelWizardHabitation);
        modelWizardHabitation.setIdDevis(devisId);

        return step2;
    }

    @RequestMapping("/private/devis/habitation/etape3")
    public ModelAndView step3(@ModelAttribute("modelWizardHabitation") @Valid ModelWizardHabitation modelWizardHabitation, BindingResult bindingResult) {
        modelWizardHabitation.setStep(2);
        ModelAndView step3 = new ModelAndView("devis/habitation-etape-3", "modelWizardHabitation", modelWizardHabitation);
        devisHabitationService.convertAndSaveByStep(modelWizardHabitation);
        return step3;
    }

    @RequestMapping("/private/devis/habitation/etape4")
    public ModelAndView step4(@ModelAttribute("modelWizardHabitation") @Valid ModelWizardHabitation modelWizardHabitation, BindingResult bindingResult) {
        modelWizardHabitation.setStep(3);
        ModelAndView step4 = new ModelAndView("devis/habitation-etape-4", "modelWizardHabitation", modelWizardHabitation);
        devisHabitationService.convertAndSaveByStep(modelWizardHabitation);
        return step4;
    }

    @RequestMapping("/private/devis/habitation/success")
    public ModelAndView succesDevisVehicule(@ModelAttribute("modelWizardHabitation") @Valid ModelWizardHabitation modelWizardHabitation, BindingResult bindingResult) {
        modelWizardHabitation.setStep(4);

        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/successDevisHabitation");

            return r;
        } else {
            return new ModelAndView("devis/habitation-etape-3", "modelWizardHabitation", modelWizardHabitation);
        }
    }

}
