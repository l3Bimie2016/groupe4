package fr;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by Joelle on 07/04/2016.
 */
@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, scopeName = "session")
public class SessionData {

    private UserVertx user;
    private String token;

    public SessionData(UserVertx user, String token){
        this.user = user;
        this.token = token;
    }

    public SessionData(){
    }

    public UserVertx getUser() {
        return user;
    }

    public void setUser(UserVertx user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
