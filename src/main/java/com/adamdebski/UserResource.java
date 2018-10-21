package com.adamdebski;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adamdebski.models.User;
import com.adamdebski.repositories.UserRepository;

@RestController
public class UserResource {

    private UserRepository userRepository;
    
    public UserResource(UserRepository userRepository) {
	this.userRepository = userRepository;
    }
    
    @GetMapping("/all")
    public List<User> showAllUsers() {
	List<User> users = userRepository.findAll();
	return users;
    }
}
