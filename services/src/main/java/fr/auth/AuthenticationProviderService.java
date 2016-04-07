package fr.auth;

import com.google.gson.Gson;
import fr.SessionData;
import fr.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Joelle on 06/04/2016.
 */
@Component
public class AuthenticationProviderService implements AuthenticationProvider {

    @Autowired
    private SessionData sessionData;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UserLogin userLogin = new UserLogin(authentication.getPrincipal(), authentication.getCredentials());

        Gson response = sendCredentialsToVertx(userLogin);

        Gson gson = new Gson();
        sessionData = response.fromJson(response.toString(), SessionData.class);

        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    private Gson sendCredentialsToVertx(UserLogin userLogin) {
        Gson response;
        RestTemplate restTemplate = new RestTemplate();

        try {
            response = restTemplate.postForObject("http://localhost:8090/api/login", userLogin, Gson.class);
            return response;
        } catch (Exception e){
            return new Gson();
        }
    }
}
