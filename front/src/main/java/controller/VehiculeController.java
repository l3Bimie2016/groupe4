package controller;

import fr.DevisVehiculeRepository;
import fr.ModelWizardVehicule;
import fr.QuotationVehicle;
import fr.WizardToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import validator.VehiculeValidator;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by nicol on 04/04/2016.
 */

@Controller
@SessionAttributes("modelWizardVehicule")
public class VehiculeController {

    @Autowired
    private VehiculeValidator vehiculeValidator;

    @Autowired
    private DevisVehiculeRepository devisVehiculeRepository;

    @Autowired
    private QuotationVehicle quotationVehicle;

    @InitBinder
    public void initBinderUser(WebDataBinder binder){
        binder.setValidator(vehiculeValidator);
    }


    @RequestMapping("/devis/vehicule/etape1")
    public ModelAndView step1(Map<String, Object> model) {
        //User user = new User("Nicolas", "Melin", "Nico", "nicowd");
        //model.put("user", user);
        return new ModelAndView("devis/vehicule-etape-1", "modelWizardVehicule", new ModelWizardVehicule());
        //return "devis/vehicule-etape-1";
    }

    @RequestMapping("/back/devis/vehicule/etape1")
    public ModelAndView backStep1(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult) {
        return new ModelAndView("devis/vehicule-etape-1", "modelWizardVehicule", modelWizardVehicule);
    }

    @RequestMapping("/devis/vehicule/etape2")
    public ModelAndView step2(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult) {
        //System.out.println("Step2");

        //System.out.println(bindingResult.getErrorCount());
        //bindingResult.getAllErrors().forEach(x -> x.getDefaultMessage());

        //System.out.println(modelWizardVehicule.getMarque());

        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/vehicule-etape-2", "modelWizardVehicule", modelWizardVehicule);
            return r;
        } else {
            return new ModelAndView("devis/vehicule-etape-1", "modelWizardVehicule", modelWizardVehicule);
        }
    }

    @RequestMapping("/devis/vehicule/etape3")
    public ModelAndView step3(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult) {
        System.out.println("step 3 : " + bindingResult.getErrorCount());
        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/vehicule-etape-3", "modelWizardVehicule", modelWizardVehicule);
            return r;
        } else {
            return new ModelAndView("devis/vehicule-etape-2", "modelWizardVehicule", modelWizardVehicule);
        }
    }

    @RequestMapping("/devis/vehicule/etape4")
    public ModelAndView step4(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult) {
        System.out.println("step 4 : " + bindingResult.getErrorCount());
        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/vehicule-etape-4", "modelWizardVehicule", modelWizardVehicule);
            return r;
        } else {
            return new ModelAndView("devis/vehicule-etape-3", "modelWizardVehicule", modelWizardVehicule);
        }
    }

    @RequestMapping("/devis/vehicule/success")
    public ModelAndView succesDevisVehicule(@ModelAttribute("modelWizardVehicule") @Valid ModelWizardVehicule modelWizardVehicule, BindingResult bindingResult) {
        System.out.println("step 4 : " + bindingResult.getErrorCount());

        if(bindingResult.getErrorCount() == 0) {
            ModelAndView r = new ModelAndView("devis/successDevisVehicule");

            quotationVehicle = new WizardToEntity(modelWizardVehicule).toEntity();

            devisVehiculeRepository.save(quotationVehicle);
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
