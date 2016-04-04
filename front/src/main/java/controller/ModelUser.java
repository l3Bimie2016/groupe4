package controller;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by Nico on 18/02/2016.
 */
@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS,scopeName = "session")
public class ModelUser {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
