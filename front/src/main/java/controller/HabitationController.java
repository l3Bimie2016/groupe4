package controller;

import fr.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Joelle on 05/04/2016.
 */
@Controller
public class HabitationController {

    @RequestMapping(value = "/devis/habitation/etape1", method = RequestMethod.GET)
    public ModelAndView test(Map<String, Object> model) {
        //todo get connected user
        User userTest = new User();
        userTest.setFirstName("Foo");
        userTest.setLastName("Quagaan");
        userTest.setLogin("Foo");
        userTest.setPassword("foo");

        ModelAndView test = new ModelAndView("/devis/habitation-etape-1");
        model.put("firstName", userTest.getFirstName());
        model.put("lastName", userTest.getLastName());
        return test;
    }


}
