package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
