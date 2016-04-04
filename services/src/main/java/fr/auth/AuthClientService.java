package fr.auth;

import fr.User;
import fr.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


/**
 * Created by Nico on 11/02/2016.
 */
@Component
public class AuthClientService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.findByLogin(username);
        if (user != null) return user;

        throw new UsernameNotFoundException("Username not found");
    }
}