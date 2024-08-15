package com.fabian.curso.springboot.error.springboot_error.services;

import com.fabian.curso.springboot.error.springboot_error.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices{

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {

        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(usr -> usr.getId().equals(id)).findFirst();
//        for (User u : users) {
//            if (u.getId().equals(id));
//            user = u;
////            System.out.println(user.getName());
//            break;
//        }
//        return Optional.ofNullable(user);
    }
}