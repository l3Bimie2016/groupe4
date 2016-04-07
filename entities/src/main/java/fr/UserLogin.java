package fr;

/**
 * Created by Joelle on 06/04/2016.
 */
public class UserLogin {

    private Object login;
    private Object password;

    public UserLogin(Object login, Object password) {
        this.login = login;
        this.password = password;
    }

    public Object getLogin() {
        return login;
    }

    public void setLogin(Object login) {
        this.login = login;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }
}
