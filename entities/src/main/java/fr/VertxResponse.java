package fr;

/**
 * Created by Joelle on 5/10/2016.
 */
public class VertxResponse {
    private UserVertx user;
    private String token;
    private String message;
    private Boolean error;


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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
