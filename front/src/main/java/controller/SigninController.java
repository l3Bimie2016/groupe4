package controller;

import fr.UserService;
import fr.UserSignin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by termiton on 05/04/16.
 */
@Controller
public class SigninController {

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/signin", method = RequestMethod.GET)
    public ModelAndView signin(){
        return new ModelAndView("signin","userSignin", new UserSignin());
    }


    @RequestMapping(value = "/signin.do",  method = RequestMethod.POST)
    public ModelAndView signInAction(@ModelAttribute UserSignin userSignin){
        Boolean saveUserResponse = userService.saveUserWithVertx(userSignin);
        ModelAndView result = new ModelAndView("index");
        if (!saveUserResponse)
        {
            result.setViewName("signin");
            result.addObject("message", "Petit problème de connexion avec le service, veuillez réessayer.");
        }
        return result;
    }

}
