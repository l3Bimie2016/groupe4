package controller;

import excep.MyException;
import fr.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

/**
 * Created by nicol on 04/04/2016.
 */
@Controller
public class VehiculeController {

    @RequestMapping("/devis/vehicule/etape1")
    public String dash(Map<String, Object> model) {
        //User user = new User("Nicolas", "Melin", "Nico", "nicowd");
       //model.put("user", user);
        return "devis/vehicule-etape-1";
    }

    @RequestMapping("/devis/vehicule/etape2")
    public String dash() {
        return "devis/vehicule-etape-2";
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
