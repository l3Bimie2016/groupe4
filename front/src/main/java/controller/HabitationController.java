package controller;

import fr.User;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Joelle on 05/04/2016.
 */
@Controller
public class HabitationController {

    @RequestMapping(value = "/devis/habitation/etape1", method = RequestMethod.GET)
    public ModelAndView step1(Map<String, Object> model) {
        //todo get connected user
        User userTest = new User();
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
        return step1;
    }

    @RequestMapping("/devis/habitation/etape2")
    public ModelAndView step2(){
        ModelAndView step2 = new ModelAndView("/devis/habitation-etape-2");
        return step2;
    }

}
