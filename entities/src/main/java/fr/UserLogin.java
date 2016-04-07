package fr;

/**
 * Created by Joelle on 06/04/2016.
 */
public class UserLogin {

    private Object username;
    private Object password;

    public UserLogin(Object username, Object password) {
        this.username = username;
        this.password = password;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }
}
