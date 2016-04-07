package controller;

import excep.MyException;
import fr.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.Map;

/**
 * Created by Nico on 09/02/2016.
 */
@Controller
public class IndexController {

    @Autowired
    private ModelUser modelUser;

    @Value("${application.message:Hello World}")
    private String message = "";

    public String test(){
            RestTemplate rest = new RestTemplate();
            return "";
    }


    @RequestMapping({"/","/index"})
    public String welcome(Map<String, Object> model) {
        String m = message;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth.getPrincipal() != null && auth.getPrincipal() instanceof User) {
            User user = (User)auth.getPrincipal();
            //m = String.format("Hello %s", user.getUsername());
        }
        model.put("message", m);
        return "index";
    }



    @RequestMapping("/private/client")
    public String dash(Map<String, Object> model) {
        model.put("message", "Vous êtes sur une page privée sans rôle");
        model.put("modelUser", modelUser);
        return "client";
    }


    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/private/admin", method = RequestMethod.GET)
    public ModelAndView admin(){
        ModelAndView model = new ModelAndView("admin");
        model.addObject("message", "Vous êtes sur une page privée avec le rôle ROLE_ADMIN");
        return model;
    }

    // for 403 access denied page
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied(Principal user) {

        ModelAndView model = new ModelAndView();

        if (user != null) {
            model.addObject("msg", "Hi " + user.getName()
                    + ", you do not have permission to access this page!");
        } else {
            model.addObject("msg",
                    "You do not have permission to access this page!");
        }

        model.setViewName("403");
        return model;

    }

    @RequestMapping("/fail")
    public String fail() throws MyException {
        throw new MyException("Oupss!!");
    }

    @RequestMapping("/fail2")
    public String fail2() {
        throw new IllegalStateException();
    }



    @ExceptionHandler(MyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String handleMyRuntimeException(MyException exception) {
        return "Error -> " + exception.getMessage();
    }

}
