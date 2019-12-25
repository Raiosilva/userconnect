package com.oliveira.connect.userconnect.resources;

import com.oliveira.connect.userconnect.domain.User;
import com.oliveira.connect.userconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping(value = "")
    public ResponseEntity<List<User>> searchAll() {
        List<User> list = service.searchAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> searchById(@PathVariable Integer id) {
        User obj = service.searchById(id);
        return ResponseEntity.ok().body(obj);
    }

}
