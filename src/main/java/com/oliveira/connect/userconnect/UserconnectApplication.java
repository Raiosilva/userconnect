package com.oliveira.connect.userconnect;

import com.oliveira.connect.userconnect.domain.User;
import com.oliveira.connect.userconnect.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class UserconnectApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserconnectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Raimundo", "raimundo@gmail.com", "71996294995");
		User u2 = new User(null, "Gessica Costa", "gessica@gmail.com", "71996715712");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}
}
