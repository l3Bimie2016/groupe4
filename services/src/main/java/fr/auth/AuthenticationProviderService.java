package fr.auth;

import fr.SessionData;
import fr.UserLogin;
import fr.VertxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Joelle on 06/04/2016.
 */
@Component
public class AuthenticationProviderService implements AuthenticationProvider {

    @Autowired
    private SessionData sessionData;

    private String vertxUrl = "10.3.5.19:8090";

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UserLogin userLogin = new UserLogin((String)authentication.getPrincipal(), (String)authentication.getCredentials());

        VertxResponse response = sendCredentialsToVertx(userLogin);

        if(response.getError() == null){
            SessionData sessionData = new SessionData(response.getUser(), response.getToken());

            authentication = new UsernamePasswordAuthenticationToken(authentication.getName(), authentication.getCredentials(), authentication.getAuthorities());

            return authentication;
        } else{
            throw new UsernameNotFoundException("Bad credentials");
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    private VertxResponse sendCredentialsToVertx(UserLogin userLogin){
        RestTemplate restTemplate = new RestTemplate();

        try {
            VertxResponse response = restTemplate.postForObject("http://" + vertxUrl + "/api/login", userLogin, VertxResponse.class);
            return response;
        } catch (Exception e){
            throw e;
        }
    }
}
