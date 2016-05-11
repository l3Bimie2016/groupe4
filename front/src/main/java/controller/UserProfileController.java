package controller;

import fr.SessionData;
import fr.UserVertx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Termiton on 11/05/2016.
 */

@Controller
public class UserProfileController {

    @Autowired
    private SessionData sessionData;

    @RequestMapping("/private/user-profile")
    public String userProfile(Map<String, Object> model) {
        UserVertx uv = sessionData.getUser();
        String userLogin = uv.getUserLogin();
        String userName = uv.getUserFirstName();
        String userLastName = uv.getUserLastName();
        String userAddress = uv.getUserAddress();
        String userCity = uv.getUserCity();
        model.put("userLogin", userLogin);
        model.put("userName", userName);
        model.put("userLastName",userLastName);
        model.put("userAddress",userAddress);
        model.put("userCity",userCity);
        return "user-profile";
    }
}
