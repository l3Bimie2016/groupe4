package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Nico on 11/02/2016.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userDao;

    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    public Boolean saveUserWithVertx(UserSignin userSignin) {
        Boolean response = false;
        RestTemplate restTemplate = new RestTemplate();
        try {
            response = restTemplate.postForObject("http://localhost:8090/user", userSignin, Boolean.class);
        }catch (Exception e){
            response = false;
        }
        finally {
            return response;
        }


    }
}
