package controller;

import fr.*;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import validator.VehiculeValidator;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

/**
 * Created by nicol on 04/04/2016.
 */

@Controller
@SessionAttributes("modelWizardVehicule")
public class VehiculeController {

    @Autowired
    private DevisGetIDService devisGetIDService;

    @Autowired
    private VehiculeValidator vehiculeValidator;

    @Autowired
    private DevisVehiculeService devisVehiculeService;

    @InitBinder
    public void initBinderUser(WebDataBinder binder){
        binder.setValidator(vehiculeValidator);
    }

    @RequestMapping("/private/devis/vehicule/resume")
    public ModelAndView resume(@RequestParam(required = false) Integer id, HttpServletRequest request) {

        if(id != null) {
            System.out.println(id);

            ModelWizardVehicule veh = devisGetIDService.getVehicule(id);

            //return new ModelAndView("devis/vehicule-etape-1", "modelWizardVehicule", veh);
           // ModelAndView model = new ModelAndView("redirect:/private/devis/vehicule/etape"+veh.getStep());
            request.getSession().setAttribute("modelWizardVehicule",veh);
            return new ModelAndView("redirect:/private/devis/vehicule/etape"+veh.getStep(), "modelWizardVehicule", veh);
        } else {
            return new ModelAndView("redirect:/");
        }
    }

    @RequestMapping("/private/devis/vehicule/etape1")
    public ModelAndView step1(Map<String, Object> model, @RequestParam(required = false) Integer id) {
        //User user = new User("Nicolas", "Melin", "Nico", "nicowd");
        //model.put("user", user);

        return new ModelAndView("devis/vehicule-etape-1", "modelWizardVehicule", new ModelWizardVehicule());
        //return "devis/vehicule-etape-1";
    }

    @RequestMapping("/private/back/devis/vehicule/etape1")
    public ModelAndView backStep1(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult, @RequestParam(required = false) Integer id) {

        return new ModelAndView("devis/vehicule-etape-1", "modelWizardVehicule", modelWizardVehicule);
    }

    @RequestMapping("/private/devis/vehicule/etape2")
    public ModelAndView step2(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult) {
        //System.out.println("Step2");



        modelWizardVehicule.setStep(1);
        //System.out.println(bindingResult.getErrorCount());
        //bindingResult.getAllErrors().forEach(x -> x.getDefaultMessage());

        //System.out.println(modelWizardVehicule.getMarque());

        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/vehicule-etape-2", "modelWizardVehicule", modelWizardVehicule);

            Integer devisId = devisVehiculeService.convertAndSaveByStep(modelWizardVehicule);
            modelWizardVehicule.setIdDevis(devisId);

            return r;
        } else {
            return new ModelAndView("devis/vehicule-etape-1", "modelWizardVehicule", modelWizardVehicule);
        }
    }

    @RequestMapping("/private/devis/vehicule/etape3")
    public ModelAndView step3(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult, @RequestParam(required = false) Integer id) {

        System.out.println("step 3 : " + bindingResult.getErrorCount());
        modelWizardVehicule.setStep(2);
        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/vehicule-etape-3", "modelWizardVehicule", modelWizardVehicule);

            devisVehiculeService.convertAndSaveByStep(modelWizardVehicule);

            return r;
        } else {
            return new ModelAndView("devis/vehicule-etape-2", "modelWizardVehicule", modelWizardVehicule);
        }
    }

    @RequestMapping("/private/devis/vehicule/etape4")
    public ModelAndView step4(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult, @RequestParam(required = false) Integer id) {

        modelWizardVehicule.setStep(3);
        System.out.println("step 4 : " + bindingResult.getErrorCount());
        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/vehicule-etape-4", "modelWizardVehicule", modelWizardVehicule);

            devisVehiculeService.convertAndSaveByStep(modelWizardVehicule);

            return r;
        } else {
            return new ModelAndView("devis/vehicule-etape-3", "modelWizardVehicule", modelWizardVehicule);
        }
    }

    @RequestMapping("/private/devis/vehicule/success")
    public ModelAndView succesDevisVehicule(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult, @RequestParam(required = false) Integer id) {

        modelWizardVehicule.setStep(4);
        System.out.println("step 4 : " + bindingResult.getErrorCount());

        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/successDevisVehicule");

            devisVehiculeService.convertAndSaveByStep(modelWizardVehicule);

            return r;
        } else {
            return new ModelAndView("devis/vehicule-etape-3", "modelWizardVehicule", modelWizardVehicule);
        }
    }

    /*@RequestMapping("/api/vehicules")
    public String dash(Map<String, Object> model) {
        return "devis/vehicule-etape-1";
    }

    /*@ExceptionHandler(MyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody
    String handleMyRuntimeException(MyException exception) {
        return "Error -> " + exception.getMessage();
    }*/
}
