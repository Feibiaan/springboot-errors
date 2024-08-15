package com.fabian.curso.springboot.error.springboot_error;

import com.fabian.curso.springboot.error.springboot_error.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Julian", "Martinez"));
        users.add(new User(3L, "Andres", "Mena"));
        users.add(new User(4L, "Fabian", "Couselo"));
        users.add(new User(5L, "Nestor", "Ruiz"));
        return users;
    }
}
