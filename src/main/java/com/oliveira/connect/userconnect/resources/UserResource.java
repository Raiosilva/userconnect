package com.oliveira.connect.userconnect.resources;

import com.oliveira.connect.userconnect.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public List<User> list() {

        User u1 = new User(1,"Raimundo Oliveira", "raimundo@gmail.com", "71996294995");
        User u2 = new User(2,"Gessica Costa", "raimundo@gmail.com", "71996294995");

        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);

        return list;
    }

}
