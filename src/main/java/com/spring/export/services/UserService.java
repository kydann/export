package com.spring.export.services;


import com.spring.export.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    public List<User> listUsers(){

        List<User> users = new ArrayList<>();

        users.add(new User(1,"christian","christian.sayago@entercs.com.mx","México",26));
        users.add(new User(2,"christian","christian.sayago@entercs.com.mx","México",26));
        users.add(new User(3,"christian","christian.sayago@entercs.com.mx","México",26));
        users.add(new User(4,"christian","christian.sayago@entercs.com.mx","México",26));

        return users;
    }

}
