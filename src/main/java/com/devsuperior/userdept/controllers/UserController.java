package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@RestController // indica que essa classe é um controller
@RequestMapping(value = "/users") // indicar o caminho que o controlador responde
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/findall")
	public List<User> findAll(){
		List<User> result = userRepository.findAll();
		return result;
	}
	
	@GetMapping(value = "/findbyid/{id}")
	public User findById(@PathVariable Long id){
		User result = userRepository.findById(id).get();
		return result;
	}
	
	@PostMapping(value = "insert")
	public User insert(@RequestBody User user){
		User result = userRepository.save(user);
		return result;
	}

}
