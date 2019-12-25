package com.oliveira.connect.userconnect.service;

import com.oliveira.connect.userconnect.domain.User;
import com.oliveira.connect.userconnect.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> searchAll() {
        return repo.findAll();
    }

    public User searchById(Integer id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
